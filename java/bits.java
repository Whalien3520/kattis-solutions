import java.io.*;
public class bits {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(scan.readLine());
		while(t > 0) {
			String x = scan.readLine();
			int ret = 0;
			for(int i = 1; i <= x.length(); i++) {
				int n = Integer.parseInt(x.substring(0, i)), cur = 0;
				while(n > 0) {
					if(n % 2 == 1)
						cur++;
					n = n >> 1;
				}
				ret = Math.max(ret, cur);
			}
			System.out.println(ret);
			t--;
		}
	}
}
