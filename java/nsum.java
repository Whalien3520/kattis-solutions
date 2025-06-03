import java.io.*;
import java.util.*;

public class nsum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    br.readLine();
		int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int ret = 0;
		for(int i = 0; i < a.length; i++)
		    ret += a[i];
		System.out.println(ret);
	}
}