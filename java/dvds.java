import java.io.*;
import java.util.*;
public class dvds {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader scan = new BufferedReader(new FileReader("test.txt"));
		int k = Integer.parseInt(scan.readLine());
		while(k-- > 0) {
			int n = Integer.parseInt(scan.readLine());
			int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int cur = 0, ret = 0;
			for(int i = 0; i < n; i++) {
				if(arr[i] == cur + 1)
					cur++;
				else
					ret++;
			}
			System.out.println(ret);
		}
		scan.close();
	}
}