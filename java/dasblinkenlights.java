import java.io.*;
import java.util.*;
public class dasblinkenlights {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] pqs = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int a = Math.max(pqs[0], pqs[1]), b = Math.min(pqs[0], pqs[1]);
		int lcm = a * b / euclid(a, b);
		System.out.println((lcm <= pqs[2]) ? "yes" : "no");
	}
	public static int euclid(int a, int b) {
		if(b == 0)
			return a;
		return euclid(b, a % b);
	}
}
