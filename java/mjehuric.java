import java.io.*;
public class mjehuric {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] sarr = scan.readLine().split(" ");
		int[] iarr = new int[5];
		for(int i = 0; i < 5; i++)
			iarr[i] = Integer.parseInt(sarr[i]);
		while(!(iarr[0] < iarr[1] && iarr[1] < iarr[2] && iarr[2] < iarr[3] && iarr[3] < iarr[4])) {
			if(iarr[0] > iarr[1]) {
				int temp = iarr[0];
				iarr[0] = iarr[1];
				iarr[1] = temp;
				for(int i : iarr)
					System.out.print(i + " ");
				System.out.println();
			}
			if(iarr[1] > iarr[2]) {
				int temp = iarr[1];
				iarr[1] = iarr[2];
				iarr[2] = temp;
				for(int i : iarr)
					System.out.print(i + " ");
				System.out.println();
			}
			if(iarr[2] > iarr[3]) {
				int temp = iarr[2];
				iarr[2] = iarr[3];
				iarr[3] = temp;
				for(int i : iarr)
					System.out.print(i + " ");
				System.out.println();
			}
			if(iarr[3] > iarr[4]) {
				int temp = iarr[3];
				iarr[3] = iarr[4];
				iarr[4] = temp;
				for(int i : iarr)
					System.out.print(i + " ");
				System.out.println();
			}
		}
	}
}
