import java.io.*;
public class millifaersla {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(scan.readLine()), b = Integer.parseInt(scan.readLine()), c = Integer.parseInt(scan.readLine());
		if(a < b && a < c)
			System.out.println("Monnei");
		else if(b < a && b < c)
			System.out.println("Fjee");
		else if(c < a && c < b)
			System.out.println("Dolladollabilljoll");
		else
			System.out.println("indeterminate");
		scan.close();
	}
}
