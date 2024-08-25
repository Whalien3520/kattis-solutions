import java.io.*;
import java.math.*;
import java.util.*;

public class batterup {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(r.readLine());
		int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] b = new int[6];
		for(int i : a)
		    b[i + 1]++;
		System.out.println((b[2] + 2 * b[3] + 3 * b[4] + 4 * b[5]) / (double)(b[1] + b[2] + b[3] + b[4] + b[5]));
	}
}