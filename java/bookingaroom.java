import java.io.*;
public class bookingaroom {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] ar = scan.readLine().split(" ");
		int r = Integer.parseInt(ar[0]), n = Integer.parseInt(ar[1]);
		if(n == r) {
			System.out.println("too late");
			return;
		}
		boolean[] bar = new boolean[r];
		while(n > 0) {
			bar[Integer.parseInt(scan.readLine()) - 1] = true;
			n--;
		}
		for(int i = 0; i < r; i++)
			if(!bar[i]) {
				System.out.println(i + 1);
				return;
			}
	}
}
