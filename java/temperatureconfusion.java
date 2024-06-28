import java.io.*;
import java.util.*;
public class temperatureconfusion {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] frac = Arrays.stream(scan.readLine().split("/")).mapToInt(Integer::parseInt).toArray();
		frac[0] -= 32 * frac[1];
		/*if(frac[0] == 0) {
			System.out.println("0/" + frac[1]);
			return;
		}*/
		frac[0] *= 5;
		frac[1] *= 9;
		int a1 = Math.abs(frac[0]);
		int a2 = Math.abs(frac[1]);
		int gcd = gcd(a1, a2);
		System.out.println((frac[0] / gcd) + "/" + (frac[1] / gcd));
		scan.close();
	}
	public static int gcd(int a, int b) {
		if(a == 0)
			return b;
		return gcd(b % a, a);
	}
}
