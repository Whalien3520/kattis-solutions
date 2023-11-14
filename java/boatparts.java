import java.io.*;
import java.util.*;
public class boatparts {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] s = scan.readLine().split(" ");
		int p = Integer.parseInt(s[0]), n = Integer.parseInt(s[1]);
		HashSet<String> set = new HashSet<>();
		for(int i = 0; i < n; i++){
			String in = scan.readLine();
			if(!set.contains(in)) {
				set.add(in);
				p--;
				if(p == 0) {
					System.out.println(i + 1);
					return;
				}
			}
		}
		System.out.println("paradox avoided");
	}
}
