import java.io.*;
public class beekeeper {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N;
		while((N = Integer.parseInt(scan.readLine())) != 0) {
			String bestr = scan.readLine();
			int max = count(bestr);
			while(--N > 0) {
				String s = scan.readLine();
				int countS = count(s);
				if(countS > max) {
					max = countS;
					bestr = s;
				}
			}
			System.out.println(bestr);
		}
		scan.close();
	}
	public static int count(String s) {
		int ret = 0;
		for(int i = 0; i < s.length() - 1; i++)
			if("aeiouy".indexOf(s.charAt(i)) > -1 && s.charAt(i) == s.charAt(i + 1))
				ret++;
		return ret;
	}
}
