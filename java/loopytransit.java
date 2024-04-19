import java.io.*;
import java.util.*;
public class loopytransit {
	static boolean[][] adj;
	static boolean[] vis;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(scan.readLine());
		adj = new boolean[m][m];
		vis = new boolean[m];
		int n = Integer.parseInt(scan.readLine());
		while(n-- > 0) {
			int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			adj[arr[0]][arr[1]] = true;
		}
		int ret = 0;
		for(int inc = 0; inc < m; inc++) {
			//make path the appropriate length
			ret += dfs(inc, inc);
			//set this node to vis so it'll never be included again
			vis[inc] = true;
		}
		System.out.println(ret);
	}
	public static int dfs(int cur, int root) {
		if(vis[cur])
			return cur == root ? 1 : 0;
		int ret = 0;
		vis[cur] = true;
		for(int i = 0; i < adj[cur].length; i++) {
			if(!adj[cur][i])
				continue;
			ret += dfs(i, root);
		}
		vis[cur] = false;
		return ret;
	}
}
