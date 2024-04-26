import java.io.*;
import java.util.*;
public class mazemovement {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(scan.readLine());
		Arrays.sort(arr);
		
		Dinic g = new Dinic(n);
		g.addEdge(n, 0, 1000000000);
		g.addEdge(n-1, n+1, 1000000000);
		for(int i = 0; i < n - 1; i++)
			for(int j = i + 1; j < n; j++) {
				int d = gcd(arr[i], arr[j]);
				if(d == 1)
					continue;
				g.addEdge(i, j, d);
				g.addEdge(j, i, d);
			}
		System.out.println(g.flow());
	}
	//find gcd of two numbers, given that b > a
	public static int gcd(int a, int b) {
		return a == 0 ? b : gcd(b%a, a);
	}
	static class Dinic {
		//respective index
		int source, dest;
		int[] level;
		boolean[] blocked;
		ArrayList<ArrayList<Edge>> edges;
		
		//creates graph with /size/ internal nodes
		public Dinic(int size) {
			source = size;
			dest = size + 1;
			level = new int[size + 2];
			blocked = new boolean[size + 2];
			edges = new ArrayList<>(size + 2);
			for(int i = 0; i < size + 2; i++)
				edges.add(new ArrayList<>());
		}
		public void addEdge(int i, int j, int cap) {
			Edge forward = new Edge(i, j, 0, cap), reverse = new Edge(j, i, 0, 0);
			forward.rev = reverse;
			reverse.rev = forward;
			edges.get(i).add(forward);
			edges.get(j).add(reverse);
		}
		//conducts bfs on graph
		//returns whether dest is reachable from source
		public boolean bfs() {
			Arrays.fill(level, -1);
			level[source] = 0;
			LinkedList<Integer> q = new LinkedList<>();
			q.add(source);
			while(!q.isEmpty()) {
				int i = q.poll();
				//if bfs reached dest, stop search and return true
				//dfs will never go from /node on same level as dest/ to dest
				if(i == dest)
					return true;
				//for every edge from current node, add node level if flow exists and level not set yet
				for(Edge e : edges.get(i))
					if(e.cap > e.flow && level[e.t] == -1) {
						level[e.t] = level[i] + 1;
						q.add(e.t);
					}
			}
			return level[dest] != -1;
		}
		//recursive dfs finding flow from given pos/
		public int dfs(int cur, int flow) {
			//base case: if at dest, return flow
			if(cur == dest)
				return flow;
			
			//recursive case
			int ret = 0;
			for(Edge e : edges.get(cur)) {
				//if level is right, edge isn't blocked, and there's available flow
				if(level[e.t] == level[cur] + 1
						&& !blocked[e.t]
								&& e.cap > e.flow) {
					//recurse on available flow = min of available edge flow and available flow out of node
					int temp = dfs(e.t, Math.min(e.cap - e.flow, flow - ret));
					//update edge flow and node(search) flow
					e.flow += temp;
					e.rev.flow = -e.flow;
					ret += temp;
				}
				if(ret == flow)
					return flow;
			}
			//if not all flow directed to this node could pass, node is full and thus blocked
			blocked[cur] = ret != flow;
			
			return ret;
		}
		public int flow() {
			int ret = 0;
			while(bfs()) {
				//unblock all nodes before a dfs
				Arrays.fill(blocked, false);
				ret += dfs(source, 1000000000);
			}
			return ret;
		}
	}
	static class Edge {
		int s, t, flow, cap;
		Edge rev;
		public Edge(int a, int b, int c, int d) {
			s = a;
			t = b;
			flow = c;
			cap = d;
		}
	}
}
