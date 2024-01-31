import java.io.*;
import java.util.*;
public class brexit {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] CPXL = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		for(int i = 0; i < CPXL[0]; i++)
			list.add(new ArrayList<>());
		
		for(int i = 0; i < CPXL[1]; i++) {
			int[] ab = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			list.get(ab[0] - 1).add(ab[1] - 1);
			list.get(ab[1] - 1).add(ab[0] - 1);
		}
		
		boolean[] vis = new boolean[CPXL[0]];
		int[] removed = new int[CPXL[0]];
		LinkedList<Integer> q = new LinkedList<>();
		q.add(CPXL[3] - 1);
		while(!q.isEmpty()) {
			int cur = q.poll();
			if(vis[cur])
				continue;
			vis[cur] = true;
			if(cur == CPXL[2] - 1)
				break;
			for(int i : list.get(cur)) {
				removed[i]++;
				if(removed[i] >= (list.get(i).size() + 1) / 2)
					q.add(i);
			}
		}
		
		System.out.println(vis[CPXL[2] - 1] ? "leave" : "stay");
		
		scan.close();
	}
}