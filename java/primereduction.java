import java.io.*;
import java.util.*;
public class primereduction {
	static HashMap<Integer, Boolean> primes = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n;
		HashMap<Integer, int[]> map = new HashMap<>();
		while((n = Integer.parseInt(scan.readLine())) != 4) {
			int save = n;
			Stack<Integer> path = new Stack<>();
			while(!map.containsKey(n) && !isPrime(n)) {
				path.push(n);
				int sum = 0;
				int sqrt = (int)Math.sqrt(n);
				int i = 2;
				while(i <= sqrt && n != 1 && !isPrime(n)) {
					if(isPrime(i)) {
						while(n % i == 0) {
							n /= i;
							sum += i;
						}
					}
					i++;
				}
				if(n == 1)
					n = sum;
				else
					n += sum; 
			}
			
			if(isPrime(n))
				map.put(n, new int[] {n, 1});
			int dist = 1;
			int[] arr = map.get(n);
			while(!path.isEmpty()) {
				int i = path.pop();
				map.put(i, new int[] {arr[0], arr[1] + dist++});
			}
			
			arr = map.get(save);
			System.out.println(arr[0] + " " + arr[1]);
		}
		scan.close();
	}
	public static boolean isPrime(int n) {
		if(primes.containsKey(n))
			return primes.get(n);
		boolean ret = false;
		for(int i = 2; i <= Math.sqrt(n) && !ret; i++)
			ret = (n % i) == 0;
		primes.put(n, !ret);
		return !ret;
	}
}
