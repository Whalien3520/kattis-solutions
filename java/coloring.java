import java.io.*;
import java.util.Arrays;
public class coloring {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		boolean[][] adj = new boolean[N][N];
		//row 0 stores neighboring colors
		//row 1 stores number of distinct colors in neighbors (degree of saturation)
		int[][] colors = new int[2][N];
		boolean[] visited = new boolean[N];
		for(int i = 0; i < N; i++) {
			int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int t : arr) {
				adj[i][t] = true;
			}
		}
		int ret = 0;
		//each step colors one node
		for(int i = 0; i < N; i++) {
			//find unvisited Node with highest degree of saturation
			int id = -1;
			for(int j = 0; j < N; j++) {
				if(visited[j])
					continue;
				if(id == -1)
					id = j;
				else if(colors[1][j] > colors[1][id])
					id = j;
			}
			visited[id] = true;
			//find color of node and update ret
			int col = 0;
			while(colors[0][id] % 2 == 1) {
				col++;
				colors[0][id] >>= 1;
			}
			ret = Math.max(ret, col + 1);
			//change colors entries of unvisited neighbors as necessary
			for(int j = 0; j < N; j++) {
				//third condition is if the current color hasn't been marked at the node yet
				if(!visited[j] && adj[id][j] && (colors[0][j] >> col) % 2 == 0) {
					colors[0][j] |= 1 << col;
					colors[1][j]++;
				}
			}
		}
		System.out.println(ret);
	}
}
