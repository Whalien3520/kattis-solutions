import java.io.*;
import java.math.*;
import java.util.*;

public class twosum
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int[] ab = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		System.out.println(ab[0] + ab[1]);
	}
}