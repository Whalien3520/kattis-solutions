import java.io.*;
import java.util.*;
public class ninetynineproblems {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		int mod = N % 100;
		N -= mod;
		if(mod < 49 && N != 0)
			System.out.println(N - 1);
		else
			System.out.println(N + 99);
		scan.close();
	}
}
