import java.io.*;
public class ghostleg {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = scan.readLine().split(" ");
		int n = Integer.parseInt(arr[0]), m = Integer.parseInt(arr[1]);
		int[] iarr = new int[n];
		for(int i = 0; i < n; i++)
			iarr[i] = i + 1;
		while(m > 0) {
			int i = Integer.parseInt(scan.readLine()), temp = iarr[i];
			iarr[i] = iarr[i - 1];
			iarr[i - 1] = temp;
			m--;
		}
		for(int i : iarr)
			System.out.println(i);
	}
}
