import java.io.*;
import java.util.*;
public class bubbletea {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		int[] teas = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int M = Integer.parseInt(scan.readLine());
		int[] tops = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			int[] line = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int j = 1; j < line.length; j++)
				min = Math.min(min, teas[i] + tops[line[j] - 1]);
		}
		int X = Integer.parseInt(scan.readLine());
		int students = X / min - 1;
		System.out.println(Math.max(students, 0));
		scan.close();
	}
}
