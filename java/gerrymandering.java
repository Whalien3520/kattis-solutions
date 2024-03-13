import java.io.*;
import java.util.*;
public class gerrymandering {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] pd = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[][] districts = new int[pd[1]][2];
		while(pd[0]-- > 0) {
			int[] input = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			districts[input[0] - 1][0] += input[1];
			districts[input[0] - 1][1] += input[2];
		}
		double v = 0, wa = 0, wb = 0;
		for(int[] district : districts) {
			v += district[0];
			v += district[1];
			int maj = (district[0] + district[1]) / 2 + 1;
			if(district[0] > district[1]) {
				int over = district[0] - maj;
				wa += over;
				wb += district[1];
				System.out.println("A " + over + " " + district[1]);
			}
			else {
				int over = district[1] - maj;
				wa += district[0];
				wb += over;
				System.out.println("B " + district[0] + " " + over);
			}
		}
		System.out.println(String.format("%.10f", Math.abs(wa - wb) / v));
	}
}
