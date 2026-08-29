import java.io.*;
import java.math.*;
import java.util.*;

public class presidentialelections {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    static String next() {
        if(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int S = nextInt(), d = 0, m = Integer.MAX_VALUE;
        int[][] DCFU = new int[S][4];
        for(int i = 0; i < S; i++) {
            for(int j = 0; j < 4; j++)
                DCFU[i][j] = nextInt();
            d += DCFU[i][0];
        }
        d = d / 2 + 1;
        for(int[] r : DCFU)
            if(r[1] > r[2] + r[3])
                d -= r[0];
        if(d <= 0) {
            System.out.print(0);
            return;
        }
        int[] k = new int[2017];
        Arrays.fill(k, Integer.MAX_VALUE);
        k[0] = 0;
        for(int[] r : DCFU)
            if(r[1] <= r[2] + r[3] && r[1] + r[3] > r[2])
                for(int c = 2016 - r[0]; c >= 0; c--)
                    if(k[c] < Integer.MAX_VALUE)
                        k[c + r[0]] = Math.min(k[c + r[0]], k[c] + (r[2] + r[3] - r[1]) / 2 + 1);
        for(int i = d; i <= 2016; i++)
            m = k[i] == -1 ? m : Math.min(m, k[i]);
        sb.append(m == Integer.MAX_VALUE ? "impossible" : m);
        System.out.print(sb);
    }
}