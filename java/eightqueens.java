import java.io.*;
public class eightqueens {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		boolean[][] tab = new boolean[8][8];
		int count = 0;
		for(int i = 0; i < 8; i++) {
			String s = scan.readLine();
			for(int j = 0; j < 8; j++) {
				if(s.charAt(j) == '.')
					continue;
				count++;
				if(tab[i][j]) {
					System.out.println("invalid");
					return;
				}
				fill(tab, i, j);
			}
		}
		if(count < 8)
			System.out.println("invalid");
		else
			System.out.println("valid");
	}
	public static void fill(boolean[][] tab, int r, int c) {
		int[][] moves = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};
		for(int[] move : moves) {
			int rr = r, cc = c;
			while(0 <= rr && rr < 8 && 0 <= cc && cc < 8) {
				tab[rr][cc] = true;
				rr += move[0];
				cc += move[1];
			}
		}
	}
}
