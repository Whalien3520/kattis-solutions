import java.io.*;
import java.util.*;
public class triarea {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int[] hb = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println((double)hb[0] * (double)hb[1] / 2);
	}
}