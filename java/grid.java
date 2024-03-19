import java.io.*;
import java.util.*;
public class grid {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] tab = new int[nm[0]][];
		for(int i = 0; i < nm[0]; i++)
			tab[i] = Arrays.stream(scan.readLine().split("")).mapToInt(Integer::parseInt).toArray();
		
		int[][] dist = new int[nm[0]][nm[1]];
		for(int i = 0; i < dist.length; i++)
			Arrays.fill(dist[i], -1);
		LinkedList<int[]> q = new LinkedList<>();
		q.add(new int[] {0, 0});
		dist[0][0] = 0;
		int[][] moves = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
		while(!q.isEmpty()) {
			int[] coord = q.poll();
			int jump = tab[coord[0]][coord[1]];
			for(int[] move : moves) {
				int finalX = coord[0] + move[0] * jump;
				int finalY = coord[1] + move[1] * jump;
				if(-1 < finalX && finalX < nm[0] && -1 < finalY && finalY < nm[1]
						&& dist[finalX][finalY] == -1) {
					q.add(new int[] {finalX, finalY});
					dist[finalX][finalY] = dist[coord[0]][coord[1]] + 1;
				}
			}
		}
		System.out.println(dist[nm[0] - 1][nm[1] - 1]);
		scan.close();
	}
}
