import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class jointattack {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		BigInteger num = BigInteger.valueOf(arr[n - 1]), den = BigInteger.ONE;
		for(int i = n - 2; i > -1; i--) {
			/*BigInteger temp = den;
			den = den.add(num.multiply(BigInteger.valueOf(arr[i])));
			num = temp;*/
			BigInteger temp = den.add(num.multiply(BigInteger.valueOf(arr[i])));
			den = num;
			num = temp;
		}
		System.out.println(num + "/" + den);
		scan.close();
	}
}