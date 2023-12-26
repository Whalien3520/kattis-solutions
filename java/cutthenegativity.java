import java.io.*;
import java.util.Arrays;
public class cutthenegativity {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine()), retI = 0;
		StringBuilder retS = new StringBuilder();
		for(int i = 1; i <= n; i++) {
			int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j = 0; j < n; j++)
				if(arr[j] != -1) {
					retI++;
					retS.append(String.format("%d %d %d\n", i, j + 1, arr[j]));
				}
		}
		System.out.println(retI);
		System.out.print(retS);
	}
}
