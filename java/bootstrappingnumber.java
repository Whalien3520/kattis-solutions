import java.io.*;
import java.util.*;
import java.math.*;
public class bootstrappingnumber {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		double n = Double.parseDouble(scan.readLine());
		double low = 1, high = 10;
		while(high - low > 1e-7) {
			double mid = (low + high) / 2;
			double pow = Math.pow(mid, mid);
			if(pow == n) {
				System.out.println(mid);
				return;
			}
			if(pow < n)
				low = mid;
			else
				high = mid;
		}
		System.out.println((low + high) / 2);
		scan.close();
	}
}
