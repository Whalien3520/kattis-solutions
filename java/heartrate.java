import java.io.*;
import java.math.*;
import java.util.*;

public class heartrate {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(r.readLine());
		while(N-- > 0) {
		    String[] a = r.readLine().split(" ");
		    int b = Integer.parseInt(a[0]);
		    double p = Double.parseDouble(a[1]);
		    System.out.println(String.format("%.4f %.4f %.4f", 60 / (p / (b - 1)), 60 * b / p, 60 / (p / (b + 1))));
		}
	}
}