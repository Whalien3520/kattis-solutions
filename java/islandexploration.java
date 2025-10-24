import java.io.*;
import java.math.*;
import java.util.*;

public class islandexploration {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] RC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] m = new char[RC[0]][];
        boolean[][] v = new boolean[RC[0]][RC[1]];
        int r = -1, c = -1, ret = 1;
        for(int i = 0; i < RC[0]; i++) {
            m[i] = br.readLine().toCharArray();
            for(int j = 0; j < RC[1] && r == -1; j++)
                if(m[i][j] == 'S') {
                    r = i;
                    c = j;
                    v[r][c] = true;
                }
        }
        int[][] moves = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        LinkedList<Integer> q = new LinkedList<>();
        q.add(r);
        q.add(c);
        while(!q.isEmpty()) {
            int rr = q.poll(), cc = q.poll();
            for(int[] move : moves) {
                int rrr = rr + move[0], ccc = cc + move[1];
                if(0 <= rrr && rrr < RC[0] && 0 <= ccc && ccc < RC[1] && !v[rrr][ccc] && m[rrr][ccc] == '#') {
                    v[rrr][ccc] = true;
                    q.add(rrr);
                    q.add(ccc);
                    ret++;
                }
            }
        }
        System.out.println(ret);
    }
}