import java.io.*;
import java.util.*;
public class narrowartgallery {
	static int[][][] dp;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nk = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		while(nk[0] != 0 || nk[1] != 0) {
			int[][] input = new int[nk[0]][2];
			for(int i = 0; i < nk[0]; i++)
				input[i] = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			
			// array can't just start with a bunch of -1's and dp from there because it will offset first data row
			// fill array with -1's so dp[i][j][0] can check for legitimate nonnegative values with -1 
			dp = new int[nk[0]][nk[1] + 1][3];
			for(int i = 0; i < nk[0]; i++)
				for(int j = 0; j <= nk[1]; j++)
					Arrays.fill(dp[i][j], -1);
			//manually set values in first row
			dp[0][0][0] = input[0][0] + input[0][1];
			if(nk[1] > 0) {
				dp[0][1][1] = input[0][1];
				dp[0][1][2] = input[0][0];
			}

			for(int i = 1; i < nk[0]; i++) {
				for(int j = Math.max(0, i + nk[1] + 1 - nk[0]); j <= Math.min(i + 1, nk[1]); j++) {
					//only update for 0 blocked if previous row could block enough rooms
					if(max(i - 1, j) >= 0)
						dp[i][j][0] = max(i - 1, j) + input[i][0] + input[i][1];
					if(j > 0) {
						dp[i][j][1] = Math.max(dp[i - 1][j - 1][0], dp[i - 1][j - 1][1]) + input[i][1];
						dp[i][j][2] = Math.max(dp[i - 1][j - 1][0], dp[i - 1][j - 1][2]) + input[i][0];
					}
				}
			}
			System.out.println(max(nk[0] - 1, nk[1]));
			nk = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		}
	}
	public static int max(int i, int j) {
		return Math.max(dp[i][j][0], Math.max(dp[i][j][1], dp[i][j][2]));
	}
}
