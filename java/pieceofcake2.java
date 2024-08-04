import java.io.*;
public class pieceofcake2 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] s = scan.readLine().split(" ");
		int n = Integer.parseInt(s[0]), h = Integer.parseInt(s[1]), v = Integer.parseInt(s[2]);
		if(n - h > h)
			h = n - h;
		if(n - v > v)
			v = n - v;
		System.out.println(h * v * 4);
	}
}
