import java.io.*;
import java.util.Arrays;
public class nucleotides {
	static char[] n = new char[] {'A', 'T', 'G', 'C'};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		char[] carr = scan.readLine().toCharArray();
		//ACTG order, 1 extra length for empty at front
		int[][] itab = new int[carr.length + 1][4];
		//temporary running count of each letter
		int[] run = new int[4];
		for(int i = 0; i < carr.length; i++) {
			run[(carr[i] >> 1) % 4]++;
			for(int j = 0; j < 4; j++)
				itab[i + 1][j] = run[j];
		}
		int m = Integer.parseInt(scan.readLine());
		while(m > 0) {
			int[] inds = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int[] temp = new int[4];
			for(int i = 0; i < 4; i++)
				temp[i] = itab[inds[1]][i] - itab[inds[0] - 1][i];
			
			//sort into ATGC order
			int s = temp[1];
			temp[1] = temp[2];
			temp[2] = temp[3];
			temp[3] = s;
			
			boolean[] done = new boolean[4];
			while(!(done[0] && done[1] && done[2] && done[3])) {
				int i = 0;
				while(done[i])
					i++;
				for(int j = i + 1; j < 4; j++)
					if(!done[j] && temp[j] > temp[i])
						i = j;
				System.out.print(n[i]);
				done[i] = true;
			}
			System.out.println();
			m--;
		}
	}
}
