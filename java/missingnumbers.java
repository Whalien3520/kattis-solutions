import java.io.*;
import java.util.*;
public class missingnumbers {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int last = 0;
		while(n-- > 0) {
			int input = Integer.parseInt(scan.readLine());
			while(++last < input)
				list.add(last);
		}
		if(list.isEmpty()) {
			System.out.println("good job");
			return;
		}
		for(int i : list)
			System.out.println(i);
		scan.close();
	}
}
