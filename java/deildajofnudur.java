import java.io.*;
import java.util.*;
public class deildajofnudur {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		String s = scan.readLine();
		int[][][] stag = new int[n][][];
		stag[0] = new int[n][];
		for(int i = 0; i < n; i++) {
			stag[0][i] = new int[26];
			stag[0][i][s.charAt(i) - 'a']++;
		}
		for(int i = 1; i < n; i++) {
			stag[i] = new int[n - i][];
			for(int j = 0; j < n - i; j++)
				stag[i][j] = addArrs(stag[i - 1][j], stag[0][j + i]);
		}
		for(int i = n - 1; i > -1; i--) {
			for(int[] arr : stag[i])
				if(valid(arr)) {
					System.out.println(i + 1);
					return;
				}
		}
		scan.close();
	}
	public static int[] addArrs(int[] a, int[] b) {
		int[] ret = new int[26];
		for(int i = 0; i < 26; i++)
			ret[i] = a[i] + b[i];
		return ret;
	}
	public static boolean valid(int[] arr) {
		int i = 0;
		while(i < arr.length && arr[i] == 0)
			i++;
		if(i == arr.length)
			return true;
		int comp = arr[i];
		while(++i < arr.length)
			if(arr[i] != 0 && arr[i] != comp)
				return false;
		return true;
	}
}