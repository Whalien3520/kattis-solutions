import java.io.*;
import java.math.*;
import java.util.*;

public class deliverydriver {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    private static String next() {
        while(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    private static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        int[] T = new int[] {nextInt(), nextInt(), nextInt()};
        int N = nextInt();
        int[][] p = new int[3][N];
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < N; j++)
                p[i][j] = nextInt();
        int[][] dp = new int[N][];
        dp[0] = new int[] {p[0][0], p[1][0], p[2][0]};
        for(int i = 1; i < N; i++)
            dp[i] = new int[] {
                p[0][i] + Math.max(dp[i - 1][0], Math.max(dp[i - 1][1] - T[0], dp[i - 1][2] - T[1])),
                p[1][i] + Math.max(dp[i - 1][0] - T[0], Math.max(dp[i - 1][1], dp[i - 1][2] - T[2])),
                p[2][i] + Math.max(dp[i - 1][0] - T[1], Math.max(dp[i - 1][1] - T[2], dp[i - 1][2]))
            };
        sb.append(Math.max(dp[N - 1][0], Math.max(dp[N - 1][1], dp[N - 1][2])));
        System.out.print(sb);
    }
}