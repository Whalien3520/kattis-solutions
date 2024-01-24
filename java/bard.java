import java.io.*;
import java.util.*;
public class bard {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		BitSet[] sets = new BitSet[N];
		for(int i = 0; i < N; i++)
			sets[i] = new BitSet(51);
		int E = Integer.parseInt(scan.readLine());
		int numSongs = 0;
		while(E-- > 0) {
			int[] arr = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for(int i = 1; i < arr.length; i++)
				pq.add(arr[i] - 1);
			if(pq.peek() == 0) {
				while(!pq.isEmpty())
					sets[pq.poll()].set(numSongs);
				numSongs++;
			}
			else {
				BitSet all = new BitSet(51);
				while(!pq.isEmpty())
					all.or(sets[pq.poll()]);
				for(int i = 1; i < arr.length; i++)
					sets[arr[i] - 1].or(all);
			}
		}
		BitSet checker = new BitSet(51);
		checker.set(0, numSongs);
		for(int i = 0; i < N; i++) {
			sets[i].and(checker);
			if(sets[i].equals(checker))
				System.out.println(i + 1);
		}
		scan.close();
	}
}
