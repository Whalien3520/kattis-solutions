import java.io.*;
import java.math.*;
import java.util.*;

public class dagatal
{
	public static void main(String[] args) throws IOException {
		int[] a = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(a[Integer.parseInt(r.readLine()) - 1]);
	}
}