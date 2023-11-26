import java.io.*;
import java.util.Arrays;
public class coast {
	static int ret = 0;
	static int[][] moves = new int[][] {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] r = scan.readLine().split(" ");
		int n = Integer.parseInt(r[0]), m = Integer.parseInt(r[1]);
		char[][] map = new char[n+2][m+2];
		Arrays.fill(map[0], '0');
		Arrays.fill(map[n+1], '0');
		for(int i = 1; i < n + 1; i++)
			map[i] = ("0" + scan.readLine() + "0").toCharArray();
		rec(map, 0, 0);
		System.out.println(ret);
	}
	private static void rec(char[][] map, int i, int j) {
		map[i][j] = '2';
		for(int[] move : moves) {
			i += move[0];
			j += move[1];
			if(i > -1 && i < map.length && j > -1 && j < map[0].length) {
				if(map[i][j] == '0')
					rec(map, i, j);
				else if(map[i][j] == '1') {
					ret++;
				}
			}
			i -= move[0];
			j -= move[1];
		}
	}
}
