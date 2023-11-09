import java.util.*;
import java.io.*;
public class bigtruck {
	static int[] nodeWeights;
	static int[][] adj;
	static ArrayList<ArrayList<Integer>> parents;
	static int[] dist;
	static boolean[] vis;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		nodeWeights = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		adj = new int[n][n];
		int m = Integer.parseInt(scan.readLine());
		while(m-- > 0) {
			int[] abd = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			adj[abd[0] - 1][abd[1] - 1] = abd[2];
			adj[abd[1] - 1][abd[0] - 1] = abd[2];
		}
		shortest();
		if(dist[n - 1] == Integer.MAX_VALUE) {
			System.out.println("impossible");
			return;
		}
		System.out.println(dist[n - 1]);
		System.out.println(maxWeight());
	}
	public static void shortest() {
		parents = new ArrayList<>();
		for(int i = 0; i < nodeWeights.length; i++)
			parents.add(new ArrayList<>());
		dist = new int[nodeWeights.length];
		//make everything have a very high distance to travel to
		Arrays.fill(dist, Integer.MAX_VALUE);
		vis = new boolean[nodeWeights.length];
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> dist[a] - dist[b]);
		dist[0] = 0;
		pq.add(0);
		while(!pq.isEmpty()) {
			int i = pq.poll();
			if(vis[i])
				continue;
			vis[i] = true;
			for(int j = 0; j < adj[i].length; j++) {
				//path doesn't exist
				if(adj[i][j] == 0)
					continue;
				//if new distance smaller than old
				if(dist[i] + adj[i][j] < dist[j]) {
					dist[j] = dist[i] + adj[i][j];
					parents.set(j, new ArrayList<>());
					parents.get(j).add(i);
					pq.add(j);
				}
				else if(dist[i] + adj[i][j] == dist[j])
					parents.get(j).add(i);
			}
		}
	}
	public static int maxWeight() {
		int[] weights = new int[nodeWeights.length];
		Arrays.fill(weights, -1);
		weights[nodeWeights.length - 1] = nodeWeights[nodeWeights.length - 1];
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> weights[b] - weights[a]);
		pq.add(nodeWeights.length - 1);
		while(!pq.isEmpty()) {
			int i = pq.poll();
			for(int parent : parents.get(i)) {
				if(weights[i] + nodeWeights[parent] > weights[parent]) {
					weights[parent] = weights[i] + nodeWeights[parent];
					pq.add(parent);
				}
			}
		}
		return weights[0];
	}
}
