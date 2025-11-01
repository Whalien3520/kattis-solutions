import java.io.*;
import java.math.*;
import java.util.*;

public class backuptowers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] rcn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= rcn[2]; i++) {
            int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            q.add(i);
            q.add(t[0] - 1);
            q.add(t[1] - 1);
        }
        
        int[][] f = new int[rcn[0]][rcn[1]], s = new int[rcn[0]][rcn[1]], moves = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while(!q.isEmpty()) {
            int i = q.poll(), r = q.poll(), c = q.poll();
            if(s[r][c] > 0 || f[r][c] == i)
                continue;
            if(f[r][c] == 0)
                f[r][c] = i;
            else if(f[r][c] != i)
                s[r][c] = i;
            for(int[] move : moves)
                if(0 <= r + move[0] && r + move[0] < rcn[0] && 0 <= c + move[1] && c + move[1] < rcn[1]) {
                    q.add(i);
                    q.add(r + move[0]);
                    q.add(c + move[1]);
                }
        }
        
        for(int[] r : f) {
            for(int c : r)
                bw.write(c + " ");
            bw.newLine();
        }
        for(int[] r : s) {
            for(int c : r)
                bw.write(c + " ");
            bw.newLine();
        }
        bw.flush();
    }
}