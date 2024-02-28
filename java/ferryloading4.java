import java.io.*;
import java.util.*;
public class ferryloading4 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(scan.readLine());
		while(c-- > 0) {
			int[] lm = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			LinkedList<Integer> left = new LinkedList<>(), right = new LinkedList<>();
			while(lm[1]-- > 0) {
				String[] arr = scan.readLine().split(" ");
				if(arr[1].equals("left"))
					left.add(Integer.parseInt(arr[0]));
				else
					right.add(Integer.parseInt(arr[0]));
			}
			
			int trips = 0;
			boolean onLeft = true;
			while(!left.isEmpty() || !right.isEmpty()) {
				int remLen = lm[0] * 100;
				if(onLeft) {
					while(!left.isEmpty() && left.peek() <= remLen)
						remLen -= left.poll();
					onLeft = false;
				}
				else {
					while(!right.isEmpty() && right.peek() <= remLen)
						remLen -= right.poll();
					onLeft = true;
				}
				trips++;
			}
			System.out.println(trips);
		}
		scan.close();
	}
}