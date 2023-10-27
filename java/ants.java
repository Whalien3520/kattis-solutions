import java.io.*;
import java.util.*;
public class ants {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(scan.readLine());
		while(c > 0) {
			int[] ln = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			//middle of stick, min distance from middle
			double middle = ln[0] * 0.5, mid = middle;
			//number of ants, max distance from end
			int a = 0, end = 0;
			while(a < ln[1]) {
				int[] ants = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				for(int ant : ants) {
					if(ant > end)
						end = ant;
					if(ln[0] - ant > end)
						end = ln[0] - ant;
					if(Math.abs(middle - ant) < mid)
						mid = Math.abs(middle - ant);
				}
				a += ants.length;
			}
			System.out.println((int) (middle - mid) + " " + end);
			c--;
		}
	}
}
