import java.io.*;
import java.util.*;
public class judging {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		
		HashMap<String, Integer> dom = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String line = scan.readLine();
			if(dom.containsKey(line))
				dom.put(line, dom.get(line) + 1);
			else
				dom.put(line, 1);
		}
		
		HashMap<String, Integer> kat = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String line = scan.readLine();
			if(kat.containsKey(line))
				kat.put(line, kat.get(line) + 1);
			else
				kat.put(line, 1);
		}
		
		Iterator<String> iter = dom.keySet().iterator();
		int ret = 0;
		while(iter.hasNext()) {
			String key = iter.next();
			if(kat.containsKey(key))
				ret += Math.min(dom.get(key), kat.get(key));
		}
		System.out.println(ret);
		scan.close();
	}
}