import java.util.*;
import java.io.*;

public class aboveaverage {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine()), arrInd, n = -1;
		double avg = 0;
		int[] arr;
		ArrayList<Integer> list = new ArrayList<>();
		while(c > 0) {
			arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			arrInd = 0;
			while(arrInd < arr.length) {
				if(n == -1) {
					n = arr[arrInd++];
					continue;
				}
				list.add(arr[arrInd]);
				avg += arr[arrInd];
				if(list.size() == n) {
					avg /= n;
					double count = 0;
					for(int i : list)
						if(i > avg)
							count += 1;
					System.out.println(String.format("%.3f%%", count / n * 100));
					n = -1;
					c--;
					list = new ArrayList<>();
					avg = 0;
				}
				arrInd++;
			}
		}
	}
}
