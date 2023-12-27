import java.io.*;
import java.math.*;
public class different {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = scan.readLine()) != null) {
			String[] arr = s.split(" ");
			BigInteger a = new BigInteger(arr[0]), b = new BigInteger(arr[1]);
			a = a.subtract(b);
			System.out.println(a.abs());
		}
	}
}
