import java.io.*;
public class hypercube {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] s = scan.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		long posA = 0, posB = 0;
		for(int i = 1; n - i >= 0; i++) {
			if(s[1].charAt(n - i) == '1')
				posA = (long)Math.pow(2, i) - 1 - posA;
			if(s[2].charAt(n - i) == '1')
				posB = (long)Math.pow(2, i) - 1 - posB;
		}
		System.out.println(posB - posA - 1);
	}
}
