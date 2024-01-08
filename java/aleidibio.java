import java.io.*;
public class aleidibio {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(scan.readLine()), b = Integer.parseInt(scan.readLine()), c = Integer.parseInt(scan.readLine());
		System.out.println(c - b - a);
		scan.close();
	}
}
