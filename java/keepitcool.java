import java.io.*;
import java.util.*;
public class keepitcool {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nmsd = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] shelf = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> shelf[a] - shelf[b]);
		int[] ret = new int[nmsd[2]];
		for(int i = 0; i < nmsd[2]; i++)
			pq.add(i);
		while(!pq.isEmpty() && nmsd[0] > 0) {
			int i = pq.poll();
			ret[i] = Math.min(nmsd[0], nmsd[3] - shelf[i]);
			nmsd[0] -= ret[i];
		}
		int uncovered = 0;
		while(!pq.isEmpty())
			uncovered += shelf[pq.poll()];
		if(uncovered < nmsd[1]) {
			System.out.println("impossible");
			return;
		}
		for(int i: ret)
			System.out.print(i + " ");
	}
}
