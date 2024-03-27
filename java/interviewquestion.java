import java.io.*;
import java.util.*;
public class interviewquestion {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] cd = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		String[] arr = scan.readLine().split(" ");
		scan.close();
		int f = -1, b = -1;
		boolean ff = false, bb = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].indexOf("Fizz") > -1) {
				if(f == -1)
					f = cd[0] + i;
				else if(!ff) {
					ff = true;
					f = cd[0] + i - f;
				}
			}
			if(arr[i].indexOf("Buzz") > -1) {
				if(b == -1)
					b = cd[0] + i;
				else if(!bb) {
					bb = true;
					b = cd[0] + i - b;
				}
			}
		}
		if(f == -1)
			f = cd[1] + 1;
		if(b == -1)
			b = cd[1] + 1;
		System.out.println(f + " " + b);
	}
}