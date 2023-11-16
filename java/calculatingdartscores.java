import java.io.*;
import java.util.*;
public class calculatingdartscores {
	//41 elements
	static int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,24,26,27,28,30,32,33,34,36,38,39,40,42,45,48,51,54,57,60};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine()), a = 40;
		while(a >= 0 && arr[a] > n) 
			a--;
		if(arr[a] == n) {
			printNum(arr[a]);
			return;
		}
		while(a >= 0) {
			int b = 40;
			while(b >= 0 && arr[b] > n - arr[a])
				b--;
			if(arr[a] + arr[b] == n) {
				printNum(arr[a]);
				printNum(arr[b]);
				return;
			}
			while(b >= 0) {
				int c = Arrays.binarySearch(arr, n - arr[a] - arr[b]);
				if(c > -1) {
					printNum(arr[a]);
					printNum(arr[b]);
					printNum(arr[c]);
					return;
				}
				b--;
			}
			a--;
		}
		System.out.println("impossible");
	}
	private static void printNum(int i) {
		if(i <= 20)
			System.out.println("single " + i);
		else if(i % 2  == 0 && i / 2 <= 20)
			System.out.println("double " + i / 2);
		else
			System.out.println("triple " + i / 3);
	}
}
