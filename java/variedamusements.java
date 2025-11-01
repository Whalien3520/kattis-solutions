import java.io.*;
import java.math.*;
import java.util.*;

public class variedamusements {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] nabc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[][] dp = new long[nabc[0]][3];
        for(int i = 0; i < 3; i++)
            dp[nabc[0] - 1][i] = nabc[i + 1];
        for(int i = nabc[0] - 2; i >= 0; i--)
            for(int j = 0; j < 3; j++)
                dp[i][j] = (nabc[j + 1] * (dp[i + 1][(j + 1) % 3] + dp[i + 1][(j + 2) % 3])) % 1000000007;
        long ret = (dp[0][0] + dp[0][1] + dp[0][2]) % 1000000007;
        bw.write(String.format("%d\n", ret));
        bw.flush();
    }
}