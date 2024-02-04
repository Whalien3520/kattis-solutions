import java.io.*;
import java.util.*;
public class busskortet {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(scan.readLine());
		scan.close();
		int mod = K % 500;
		int ret = (K / 500);
		if(mod == 0) {
			System.out.println(ret);
			return;
		}
		if(mod <= 200 || mod > 400) {
			System.out.println(ret + 1);
			return;
		}
		System.out.println(ret + 2);
	}
}