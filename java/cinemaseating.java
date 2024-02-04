import java.io.*;
import java.util.*;
public class cinemaseating {
	static int[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] RC = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		map = new int[RC[0]][RC[1]];
		int N = Integer.parseInt(scan.readLine());
		int[][] coords = new int[N][];
		while(N-- > 0) {
			coords[N] = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			coords[N][0]--;
			coords[N][1]--;
			fill(coords[N][0], coords[N][1]);
		}
		int[] k = new int[9];
		for(int[] coord : coords)
			k[map[coord[0]][coord[1]]]++;
		for(int i : k)
			System.out.print(i + " ");
		scan.close();
	}
	static int[][] moves = {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
	public static void fill(int r, int c) {
		for(int[] move : moves) {
			int rr = r + move[0];
			int cc = c + move[1];
			if(0 <= rr && rr < map.length && 0 <= cc && cc < map[0].length)
				map[rr][cc] += 1;
		}
	}
}
