import java.io.*;
import java.util.*;
public class glitchbot {
	static String[] find = {"Forward", "Right", "Left"};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] xy = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int n = Integer.parseInt(scan.readLine());
		int[] moves = new int[n];
		while(n-- > 0) {
			String line = scan.readLine();
			if(find[0].equals(line))
				moves[moves.length - n - 1] = 0;
			else if(find[1].equals(line))
				moves[moves.length - n - 1] = 1;
			else if(find[2].equals(line))
				moves[moves.length - n - 1] = 2;
			else {
				System.out.println("A bad move was read in");
				return;
			}
		}
		for(int i = 0; i < moves.length; i++) {
			moves[i] = (moves[i] + 1) % 3;
			int[] one = execute(moves);
			if(one[0] == xy[0] && one[1] == xy[1]) {
				System.out.println((i + 1) + " " + find[moves[i]]);
				return;
			}
			moves[i] = (moves[i] + 1) % 3;
			int[] two = execute(moves);
			if(two[0] == xy[0] && two[1] == xy[1]) {
				System.out.println((i + 1) + " " + find[moves[i]]);
				return;
			}
			moves[i] = (moves[i] + 1) % 3;
		}
	}
	static int[][] offsets = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	public static int[] execute(int[] moves) {
		int[] ret = {0, 0};
		int dir = 0;
		for(int move : moves) {
			switch(move) {
			case 0:
				ret[0] += offsets[dir][0];
				ret[1] += offsets[dir][1];
				break;
			case 1:
				dir = (dir + 1) % 4;
				break;
			case 2:
				dir = (dir + 3) % 4;
				break;
			default:
				System.out.println("bad move in moves");
				System.exit(1);
			}
		}
		return ret;
	}
}
