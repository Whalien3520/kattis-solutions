import java.util.*;
import java.io.*;
public class fourthought {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String> map = new HashMap<>();
		map.put(-60, "-**");
		map.put(-16, "--*");
		map.put(-15, "/-*");
		map.put(-8, "+-*");
		map.put(-7, "/--");
		map.put(-4, "//-");
		map.put(-1, "--/");
		map.put(0, "+--");
		map.put(1, "+/-");
		map.put(2, "/+/");
		map.put(4, "+//");
		map.put(7, "+-/");
		map.put(8, "++-");
		map.put(9, "++/");
		map.put(15, "*-/");
		map.put(16, "+++");
		map.put(17, "*+/");
		map.put(24, "++*");
		map.put(32, "*+*");
		map.put(60, "**-");
		map.put(68, "+**");
		map.put(256, "***");
		int m = Integer.parseInt(scan.readLine());
		while(m-- > 0) {
			int n = Integer.parseInt(scan.readLine());
			if(map.containsKey(n)) {
				for(char c : map.get(n).toCharArray())
					System.out.print("4 " + c + " ");
				System.out.println(String.format("4 = %d", n));
			}
			else
				System.out.println("no solution");
		}
	}
}
