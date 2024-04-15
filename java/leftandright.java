import java.io.*;
public class leftandright {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		String input = scan.readLine();
		int lefts = 0, curMax = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == 'L') {
				lefts++;
				continue;
			}
			curMax += lefts + 1;
			for(int j = 0; j <= lefts; j++)
				System.out.println(curMax - j);
			lefts = 0;
		}
			for(int j = 0; j <= lefts; j++)
				System.out.println(input.length() + 1 - j);
		scan.close();
	}
}
