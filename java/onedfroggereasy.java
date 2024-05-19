import java.io.*;
import java.util.*;
public class onedfroggereasy {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nsm = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] board = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		nsm[1]--;
		int h = 0;
		boolean[] vis = new boolean[nsm[0]];
		while(true) {
			if(board[nsm[1]] == nsm[2]) {
				System.out.println("magic");
				break;
			}
			if(vis[nsm[1]]) {
				System.out.println("cycle");
				break;
			}
			vis[nsm[1]] = true;
			nsm[1] += board[nsm[1]];
			h++;
			if(nsm[1] >= nsm[0]) {
				System.out.println("right");
				break;
			}
			if(nsm[1] < 0) {
				System.out.println("left");
				break;
			}
		}
		System.out.println(h);
	}
}
