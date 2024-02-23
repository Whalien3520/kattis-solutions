import java.io.*;
public class enlarginghashtables {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while((n = Integer.parseInt(scan.readLine())) != 0) {
			boolean nPrime = isPrime(n);
			int i = n * 2 + 1;
			while(!isPrime(i))
				i += 2;
			System.out.print(i);
			if(!nPrime)
				System.out.print(" (" + n + " is not prime)");
			System.out.println();
		}
		scan.close();
	}
	public static boolean isPrime(int n) {
		boolean flag = false;
		for(int i = 2; i <= Math.sqrt(n) && !flag; i++)
			flag = (n % i) == 0;
		return !flag;
	}
}
