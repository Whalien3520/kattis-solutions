import java.io.*;
import java.util.*;
public class dyslectionary {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = scan.readLine()) != null) {
			PriorityQueue<String> pq = new PriorityQueue<>();
			int l = s.length();
		
			pq.add(new StringBuilder(s).reverse().toString());
			while((s = scan.readLine()) != null && !s.equals("")) {
				l = Math.max(l, s.length());
				pq.add(new StringBuilder(s).reverse().toString());
			}
			while(!pq.isEmpty())
				System.out.printf("%" + l + "s\n", new StringBuilder(pq.poll()).reverse().toString());
			if(s != null)
				System.out.println();
		}
	}
}
