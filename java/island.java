import java.io.*;
import java.util.*;
public class island {
	static int[][] moves = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int num = 1, line;
		String s;
		char[][] arr;
		while((s = scan.readLine()) != null) { // assume at least one map is present
			line = 0;
			arr = new char[80][80];
			int wid = s.length();
			do {
				arr[line++] = s.toCharArray();
			} while((s = scan.readLine()) != null && s.length() != 0);
			
			int[] islandsBridges = flood(arr, line, wid);
			System.out.println("Map " + num++);
			System.out.println("islands: " + islandsBridges[0]);
			System.out.println("bridges: " + islandsBridges[1]);
			System.out.println("buses needed: " + sink(arr, line, wid));
			System.out.println();
		}
	}
	public static int[] flood(char[][] map, int len, int wid) {
		//int ret = 0;
		int[] ret = {0, 0};
		boolean[][] vis = new boolean[len][wid];
		for(int r = 0; r < len; r++) {
			for(int c = 0; c < wid; c++) {
				if(vis[r][c])
					continue;
				if(map[r][c] == 'X' || map[r][c] == '#') {
					ret[0]++;
					floodPiece(map, vis, len, wid, r, c, "#X");
					//printArr(vis);
				}
				else if(map[r][c] == 'B') {
					ret[1]++;
					floodPiece(map, vis, len, wid, r, c, "B");
					//printArr(vis);
				}
			}
		}
		return ret;
	}
	public static void floodPiece(char[][] map, boolean[][] vis, int len, int wid, int r, int c, String old) {
		Queue<Integer> q = new LinkedList<>();
		q.add(r);
		q.add(c);
		vis[r][c] = true;
		while(!q.isEmpty()) {
			int rr = q.poll(), cc = q.poll();
			for(int[] move : moves) {
				if(-1 < rr + move[0] &&
				   rr + move[0] < len &&
				   -1 < cc + move[1] &&
				   cc + move[1] < wid &&
				   !vis[rr + move[0]][cc + move[1]] && 
				   old.indexOf(map[rr + move[0]][cc + move[1]]) > -1) {
					vis[rr + move[0]][cc + move[1]] = true;
					q.add(rr + move[0]);
					q.add(cc + move[1]);
				}
			}
		}
	}
	public static int sink(char[][] map, int len, int wid) {
		int ret = 0;
		boolean[][] vis = new boolean[len][wid];
		for(int r = 0; r < len; r++) {
			for(int c = 0; c < wid; c++) {
				if(vis[r][c])
					continue;
				if(map[r][c] == '#' || map[r][c] == 'X') {
					ret++;
					Queue<Integer> qIsland = new LinkedList<>(), qBridge = new LinkedList<>();
					qIsland.add(r);
					qIsland.add(c);
					vis[r][c] = true;
					while(!qIsland.isEmpty() || !qBridge.isEmpty()) {
						while(!qIsland.isEmpty()) {
							int rr = qIsland.poll(), cc = qIsland.poll();
							for(int[] move : moves) {
								if(-1 < rr + move[0] &&
								   rr + move[0] < len &&
								   -1 < cc + move[1] &&
								   cc + move[1] < wid &&
								   !vis[rr + move[0]][cc + move[1]]) {
									if(map[rr + move[0]][cc + move[1]] == '#' || map[rr + move[0]][cc + move[1]] == 'X') {
										vis[rr + move[0]][cc + move[1]] = true;
										qIsland.add(rr + move[0]);
										qIsland.add(cc + move[1]);
									}
									else if(map[rr][cc] == 'X' && map[rr + move[0]][cc + move[1]] == 'B') {
										vis[rr + move[0]][cc + move[1]] = true;
										qBridge.add(rr + move[0]);
										qBridge.add(cc + move[1]);
									}
								}
							}
						}
						while(!qBridge.isEmpty()) {
							int rr = qBridge.poll(), cc = qBridge.poll();
							for(int[] move : moves) {
								if(-1 < rr + move[0] &&
								   rr + move[0] < len &&
								   -1 < cc + move[1] &&
								   cc + move[1] < wid &&
								   !vis[rr + move[0]][cc + move[1]]) {
									if(map[rr + move[0]][cc + move[1]] == 'B') {
										vis[rr + move[0]][cc + move[1]] = true;
										qBridge.add(rr + move[0]);
										qBridge.add(cc + move[1]);
									}
									else if(map[rr + move[0]][cc + move[1]] == 'X') {
										vis[rr + move[0]][cc + move[1]] = true;
										qIsland.add(rr + move[0]);
										qIsland.add(cc + move[1]);
									}
								}
							}
						}
					}
				}
			}
		}
		return ret;
	}
}
