import java.io.*;
import java.util.*;
public class peapattern {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = scan.readLine().split(" ");
		scan.close();
		if(arr[0].equals(arr[1])) {
			System.out.println(1);
			return;
		}
		int i = 1;
		HashSet<String> set = new HashSet<>();
		set.add(arr[0]);
		while(i < 101) {
			//System.out.println(arr[0]);
			int[] digs = new int[10];
			for(char c : arr[0].toCharArray())
				digs[c - '0']++;
			String next = "";
			for(int n = 0; n < 10; n++)
				if(digs[n] > 0) {
					next += digs[n];
					next += n;
				}
			if(next.equals(arr[1])) {
				System.out.println(i + 1);
				return;
			}
			if(set.contains(next)) {
				System.out.println("Does not appear");
				return;
			}
			arr[0] = next;
			set.add(arr[0]);
			i++;
		}
		System.out.println("I'm bored");
	}
}