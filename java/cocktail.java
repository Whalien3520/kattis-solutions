import java.io.*;
import java.util.*;
public class cocktail {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] NT = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] arr = new int[NT[0]];
		for(int i = 0; i < NT[0]; i++)
			arr[i] = Integer.parseInt(scan.readLine());
		Arrays.sort(arr);
		int timeout = Integer.MAX_VALUE;
		for(int i = 0; i < NT[0]; i++) {
			int cur = i * NT[1];
			if(cur >= timeout) {
				System.out.println("NO");
				return;
			}
			timeout = Math.min(timeout, cur + arr[arr.length - i - 1]);
		}
		System.out.println("YES");
		scan.close();
	}
}