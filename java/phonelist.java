import java.io.*;
import java.util.*;
public class phonelist {
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(r.readLine());
		while(t-- > 0) {
			int n = Integer.parseInt(r.readLine());
			Node[] arr = new Node[10];
			for(int i = 0; i < 10; i++)
				arr[i] = new Node();
			PriorityQueue<String> q = new PriorityQueue<>((a, b) -> a.length() - b.length());
			while(n-- > 0)
				q.add(r.readLine());
			boolean flag = false;
			while(!q.isEmpty() && !flag) {
				String s = q.poll();
				Node cur = arr[s.charAt(0) - '0'];
				for(int i = 1; i < s.length() && !flag; i++) {
					if(cur.stop)
						flag = true;
					int next = s.charAt(i) - '0';
					if(cur.digs[next] == null)
						cur.digs[next] = new Node();
					cur = cur.digs[next];
				}
				cur.stop = true;
			}
			if(flag)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
	public static class Node {
		Node[] digs;
		boolean stop;
		public Node() {
			digs = new Node[10];
			stop = false;
		}
	}
}
