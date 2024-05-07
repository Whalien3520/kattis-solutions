import java.io.*;
public class modulo {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[42];
		int ret = 0;
		for(int i = 0; i < 10; i++) {
			int n = Integer.parseInt(scan.readLine()) % 42;
			if(!arr[n]) {
				arr[n] = true;
				ret++;
			}
		}
		System.out.println(ret);
	}
}
