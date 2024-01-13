import java.io.*;
public class aliennumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine()), c = 1;
		while(c <= n) {
			String[] line = scan.readLine().split(" ");
			int dec = 0;
			for(int i = 0; i < line[0].length(); i++)
				dec += line[1].indexOf(line[0].charAt(i)) * (int)Math.pow(line[1].length(), line[0].length() - i - 1);
			String s = "";
			while(dec > 0) {
				s += line[2].charAt(dec % line[2].length());
				dec /= line[2].length();
			}
			System.out.print("Case #" + c + ": ");
			for(int i = s.length() - 1; i > -1; i--)
				System.out.print(s.charAt(i));
			System.out.println();
			c++;
		}
		scan.close();
	}
}
