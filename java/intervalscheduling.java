import java.io.*;
import java.util.*;
public class intervalscheduling {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine()), i = 0;
		Pair[] arr = new Pair[n];
		while(i < n) {
			String[] in = scan.readLine().split(" ");
			arr[i++] = new Pair(Integer.parseInt(in[0]), Integer.parseInt(in[1]));
		}
		
		Arrays.sort(arr);
		int last = arr[0].e, ret = 1;
		for(i = 1; i < arr.length; i++) {
			if(arr[i].s >= last) {
				last = arr[i].e;
				ret++;
			}
		}
		System.out.println(ret);
	}
	static class Pair implements Comparable<Pair> {
		int s, e;
		public Pair(int a, int b) {
			s = a;
			e = b;
		}
		public int compareTo(Pair p) {
			return this.e - p.e;
		}
	}
}
