import java.io.*;
import java.util.*;
public class crosscountry {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nst = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] adj = new int[nst[0]][];
		for(int i = 0; i < nst[0]; i++)
			adj[i] = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] dist = new int[nst[0]];
		Arrays.fill(dist, Integer.MAX_VALUE);
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
		dist[nst[1]] = 0;
		pq.add(nst[1]);
		while(!pq.isEmpty()) {
			int i = pq.poll();
			//if(dist[i] != Integer.MAX_VALUE)
				//continue;
			for(int c = 0; c < nst[0]; c++)
				if(dist[i] + adj[i][c] < dist[c]) {
					dist[c] = dist[i] + adj[i][c];
					pq.add(c);
				}
		}
		System.out.println(dist[nst[2]]);
		scan.close();
	}
}
