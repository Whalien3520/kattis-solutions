import java.io.*;
import java.util.*;
public class firefly {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nh = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] cave = new int[2][nh[0] / 2];
		for(int i = 0; i < nh[0]; i++) {
			if((i & 1) == 0)
				cave[0][i / 2] = Integer.parseInt(scan.readLine()) - 1;
			else
				cave[1][i / 2] = Integer.parseInt(scan.readLine());
		}
		Arrays.sort(cave[0]);
		Arrays.sort(cave[1]);
		
		int[] counts = new int[nh[1]];
		for(int i = 0; i < nh[1]; i++) {
			//get index of first element >= height
			int ind = Arrays.binarySearch(cave[0], i);
			int jind = Arrays.binarySearch(cave[1], nh[1] - i);
			//if negative, take abs and subtract 1
			if(ind < 0)
				ind = - ind - 1;
			if(jind < 0)
				jind = - jind - 1;
			//find minimum index
			if(ind < cave[0].length)
				while(ind > 0 && cave[0][ind] == cave[0][ind - 1])
					ind--;
			if(jind < cave[1].length)
				while(jind > 0 && cave[1][jind] == cave[1][jind - 1])
					jind--;
			counts[i] = cave[0].length - ind + cave[1].length - jind;
			//System.out.printf("%d %d %d\n", i, ind, jind);
		}
		int min = counts[0], ret = 1;
		for(int i = 1; i < counts.length; i++) {
			if(counts[i] == min)
				ret++;
			else if(counts[i] < min) {
				min = counts[i];
				ret = 1;
			}
		}
		System.out.println(min + " " + ret);
	}
}
