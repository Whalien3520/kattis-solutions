import java.io.*;
import java.util.*;
public class oddgnome {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		while(n-- > 0) {
			int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int i = 2; i < arr.length - 1; i++)
				if(arr[i] != (arr[i - 1] + 1)) {
					System.out.println(i);
					break;
				}
		}
	}
}
