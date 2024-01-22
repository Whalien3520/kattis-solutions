import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class anothercandies {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(scan.readLine());
		while(t-- > 0) {
			String s = scan.readLine();
			int children = Integer.parseInt(scan.readLine());
			BigInteger sum = BigInteger.ZERO;
			for(int i = 0; i < children; i++)
				sum = sum.add(new BigInteger(scan.readLine()));
			//System.out.println(sum + " " + children);
			sum = sum.mod(BigInteger.valueOf(children));
			System.out.println(sum.equals(BigInteger.ZERO) ? "YES" : "NO");
		}
	}
}
