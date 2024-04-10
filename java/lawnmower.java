import java.io.*;
import java.util.*;
public class lawnmower {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(!(s = scan.readLine()).equals("0 0 0.0")) {
			String[] arr = s.split(" ");
			double w = Double.parseDouble(arr[2]);
			double[] len = Arrays.stream(scan.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
			double[] wid = Arrays.stream(scan.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
			Arrays.sort(len);
			Arrays.sort(wid);
			boolean good = true;
			if(len[0] > w / 2 || len[len.length - 1] < (75 - w / 2) || wid[0] > w / 2 || wid[wid.length - 1] < (100 - w / 2)) {
				System.out.println("NO");
				good = false;
			}
			for(int i = 0; i < len.length - 1 && good; i++)
				if(len[i] + w < len[i + 1]) {
					System.out.println("NO");
					good = false;
				}
			
			for(int i = 0; i < wid.length - 1 && good; i++)
				if(wid[i] + w < wid[i + 1]) {
					System.out.println("NO");
					good = false;;
				}
			if(good)
				System.out.println("YES");
		}
	}
}
