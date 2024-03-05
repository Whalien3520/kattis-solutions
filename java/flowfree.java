import java.io.*;
public class flowfree {
	//board only stores the given state and is never edited
	static char[][] board = new char[4][4];
	//need visited to keep track of such cells
	static boolean[][] visited = new boolean[4][4];
	static int moves[][] = new int[][] {{0,1},{0,-1},{-1,0},{1,0}};
	static int filled = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < 4; i++)
			board[i] = scan.readLine().toCharArray();
		int x = 0, y = 0;
		char c = 'R';
		for(int i = 0; i < 16; i++)
			if(board[i / 4][i % 4] != 'W') {
				x = i / 4;
				y = i % 4;
				c = board[i / 4][i % 4];
				break;
			}
		rec(x, y, c);
		System.out.println("not solvable");
	}
	public static void rec(int x, int y, char c) {
		//because board is never edited, need to check visited before recursing on cell
		if(visited[x][y])
			return;
		visited[x][y] = true;
		
		//increment filled and check if board is filled
		if(++filled == 16) {
			System.out.println("solvable");
			System.exit(0);
		}
		
		//loop through all 4 moves
		for(int[] move : moves) {
			int xm = x + move[0];
			int ym = y + move[1];
			
			//if the post-move coordinates are valid and have not been visited
			if((-1 < xm && xm < 4 && -1 < ym && ym < 4) && !visited[xm][ym]) {
				//if the coordinates hold the other endpoint of the current color
				if(board[xm][ym] == c) {
					//add to filled and set visited because of endpoint
					if(++filled == 16) {
						System.out.println("solvable");
						System.exit(0);
					}
					visited[xm][ym] = true;
					
					//now know there are more cells not filled
					//loop over all cells, look for unvisited endpoint
					for(int i = 0; i < 4; i++)
						for(int j = 0; j < 4; j++)
							if(board[i][j] != 'W' && !visited[i][j])
								rec(i, j, board[i][j]);
					
					//the current connection between endpoints failed
					//undo filled and visited
					filled--;
					visited[xm][ym] = false;
				}
				//only recurse if the cell is white
				else if(board[xm][ym] == 'W')
					rec(xm, ym, c);
			}
			
		}
		
		//undo fill and visit before returning from recursive step
		filled--;
		visited[x][y] = false;
	}
	public static boolean valid(int x, int y) {
		return -1 < x && x < 4 && -1 < y && y < 4;
	}
}
