import java.io.*;
import java.util.*;
public class alienmath {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(scan.readLine());
		
		String[] D = scan.readLine().split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < B; i++)
			map.put(D[i], i);
		
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		String line = scan.readLine();
		scan.close();
		while(i < line.length()) {
			int j = i + 1;
			while(!map.containsKey(line.substring(i, j)))
				j++;
			list.add(map.get(line.substring(i, j)));
			i = j;
		}
		
		int ret = 0;
		for(int n = 0; n < list.size(); n++)
			ret += list.get(list.size() - n - 1) * (int)Math.pow(B, n);
		System.out.println(ret);
	}
}