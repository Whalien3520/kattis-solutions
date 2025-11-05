import java.io.*;
import java.math.*;
import java.util.*;

public class cheatingstudents {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] xy = new int[N][2];
        int[] d = new int[N];
        boolean[] v = new boolean[N];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        
        xy[0] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        v[0] = true;
        
        
        for(int i = 1; i < N; i++) {
            xy[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            d[i] = Math.abs(xy[i][0] - xy[0][0]) + Math.abs(xy[i][1] - xy[0][1]);
            pq.add(new int[] {d[i], i});
        }
        
        int ret = 0;
        for(int i = 1; i < N; i++) {
            int[] o;
            do {
                o = pq.poll();
            } while(v[o[1]]);
            ret += 2 * d[o[1]];
            v[o[1]] = true;
            
            for(int j = 1; j < N; j++) {
                if(v[j]) 
                    continue;
                int t = Math.abs(xy[o[1]][0] - xy[j][0]) + Math.abs(xy[o[1]][1] - xy[j][1]);
                if(t < d[j]) {
                    d[j] = t;
                    pq.add(new int[] {t, j});
                }
            }
        }
        System.out.println(ret);
    }
}