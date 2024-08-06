import java.io.*;
import java.util.*;
public class primepath {
	static HashMap<String, Boolean> primes;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int z = Integer.parseInt(scan.readLine());
		
		primes = new HashMap<>();
		for(int i = 1001; i < 10000; i++)
			if(prime(i))
				primes.put(Integer.toString(i), false);
		
		while(z > 0) {
			String[] arr = scan.readLine().split(" ");
			compute(arr[0], arr[1]);
			Iterator<String> iter = primes.keySet().iterator();
			while(iter.hasNext())
				primes.put(iter.next(), false);
			z--;
		}
	}
	static void compute(String s, String e) {
		LinkedList<Prime> q = new LinkedList<>();
		q.add(new Prime(s, 0));
		primes.put(s, true);
		while(!q.isEmpty()) {
			Prime p = q.poll();
			if(p.s.equals(e)) {
				System.out.println(p.d);
				return;
			}
			
			char[] arr = p.s.toCharArray();
			for(int i = 0; i < 4; i++) {
				char save = arr[i];
				for(int j = 0; j < 10; j++) {
					arr[i] = (char) (48 + j);
					String temp = new String(arr);
					if(primes.get(temp) != null && primes.get(temp) == false) {
						q.add(new Prime(temp, p.d + 1));
						primes.put(temp, true);
					}
				}
				arr[i] = save;
			}
		}
		System.out.println("Impossible");
	}
	static boolean prime(int i) {
		for(int j = 2; j <= Math.sqrt(i); j++)
			if(i % j == 0)
				return false;
		return true;
	}
	static class Prime {
		String s;
		int d;
		public Prime(String a, int b) {
			s = a;
			d = b;
		}
	}
}
