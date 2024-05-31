import java.io.*;
import java.util.*;
public class whichisgreater {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int[] ab = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println((a > b) ? 1 : 0);
	}
}