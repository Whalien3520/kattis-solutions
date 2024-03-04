import java.util.*;
import java.io.*;
public class flipfive {
	static int[] flips = {0b110100000, 0b111010000, 0b011001000, 0b100110100, 0b010111010, 0b001011001, 0b000100110, 0b000010111, 0b000001011};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int p = Integer.parseInt(scan.readLine());
		while(p-- > 0) {
			int grid = 0;
			//loop over 9 chars
			for(int i = 0; i < 9; i += 3) {
				String s = scan.readLine();
				for(int j = 0; j < 3; j++)
					//problem is equivalent to transformation to all whites, make blacks 1 and whites 0
					if(s.charAt(j) == '*')
						grid |= 1 << (i + j);
			}
			//System.out.println(grid);
			System.out.println(dfs(grid, 0, 0));
		}
	}
	public static int dfs(int grid, int bitmap, int numFlipped) {
		if(grid == 0)
			return numFlipped;
		//if(flipped == 0b111111111)
			//return Integer.MAX_VALUE;
		int ret = Integer.MAX_VALUE;
		for(int i = 0; i < 9; i++) {
			if((bitmap & (1 << i)) == 0) {
				ret = Math.min(ret, dfs(grid ^ flips[i], bitmap | (1 << i), numFlipped + 1));
			}
		}
		return ret;
	}
}
