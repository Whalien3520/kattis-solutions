import java.io.*;
import java.math.*;
import java.util.*;

public class grasshopper {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        int[][] moves = new int[][] {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
        while((s = br.readLine()) != null) {
            int[] RC = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            RC[2]--;
            RC[3]--;
            RC[4]--;
            RC[5]--;
            int[][] d = new int[RC[0]][RC[1]];
            d[RC[2]][RC[3]] = 1;
            Queue<Integer> q = new LinkedList<>();
            q.add(RC[2]);
            q.add(RC[3]);
            while(!q.isEmpty() && d[RC[4]][RC[5]] == 0) {
                int r = q.poll(), c = q.poll();
                for(int[] move : moves) {
                    int rr = r + move[0], cc = c + move[1];
                    if(0 <= rr && rr < RC[0] && 0 <= cc && cc < RC[1] && d[rr][cc] == 0) {
                        d[rr][cc] = d[r][c] + 1;
                        q.add(rr);
                        q.add(cc);
                    }
                }
            }
            bw.write(String.format("%s\n", d[RC[4]][RC[5]] != 0 ? d[RC[4]][RC[5]] - 1 : "impossible"));
        }
        bw.flush();
    }
}