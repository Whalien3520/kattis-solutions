import java.io.*;
public class hailstone2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int count = 1;
		long n = Long.parseLong(scan.readLine());
		while(n != 1) {
			if(n % 2 == 0)
				n /= 2;
			else
				n = 3 * n + 1;
			count++;
		}
		System.out.println(count);
	}
}
