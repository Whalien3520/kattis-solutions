import java.util.*;
import java.io.*;
public class cantinaofbabel {
	static boolean[][] adj;
	static int ind, ret;
	static int[] indices, low;
	static Stack<Integer> stack;
	static boolean[] stacked;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		adj = new boolean[n][n];
		ind = 1;
		ret = 1;
		indices = new int[n];
		low = new int[n];
		stack = new Stack<>();
		stacked = new boolean[n];
		HashMap<String, ArrayList<Integer>> speak = new HashMap<>(), understand = new HashMap<>();
		
		//setup adj matrix
		for(int i = 0; i < n; i++) {
			String[] arr = scan.readLine().split(" ");
			if(!speak.containsKey(arr[1]))
				speak.put(arr[1], new ArrayList<>());
			speak.get(arr[1]).add(i);
			if(!understand.containsKey(arr[1]))
				understand.put(arr[1], new ArrayList<>());
			understand.get(arr[1]).add(i);
			for(int j = 2; j < arr.length; j++) {
				if(!understand.containsKey(arr[j]))
					understand.put(arr[j], new ArrayList<>());
				understand.get(arr[j]).add(i);
			}
		}
		Iterator<String> iter = speak.keySet().iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			for(int i : speak.get(s))
				for(int j : understand.get(s))
					//each person who speaks a language can be understood by someone who understands that language
					//don't make self-pointing edges
					if(i != j)
						adj[i][j] = true;
		}
		
		for(int i = 0; i < n; i++)
			if(indices[i] == 0)
				dfs(i);
		System.out.println(n - ret);
	}
	public static void dfs(int i) {
		indices[i] = ind;
		low[i] = ind++;
		stack.push(i);
		stacked[i] = true;
		
		for(int j = 0; j < adj[i].length; j++) {
			if(!adj[i][j])
				continue;
			//unvisited
			if(indices[j] == 0) {
				dfs(j);
				low[i] = Math.min(low[i], low[j]);
			}
			//
			else if(stacked[j])
				low[i] = Math.min(low[i], indices[j]);
		}
		if(low[i] == indices[i]) {
			int count = 0;
			while(stack.peek() != i) {
				stacked[stack.pop()] = false;
				count++;
			}
			stacked[stack.pop()] = false;
			ret = Math.max(ret, count + 1);
		}
	}
}
