import java.io.*;
import java.math.*;
import java.util.*;

public class bolk {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] vh = new int[nc[0]][];
        for(int i = 0; i < nc[0]; i++)
            vh[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dp = new int[nc[1] + 1];
        for(int[] r : vh)
            for(int i = nc[1]; i >= r[0]; i--)
                dp[i] = Math.max(dp[i], r[1] + dp[i - r[0]]);
        System.out.println(dp[nc[1]]);
    }
}