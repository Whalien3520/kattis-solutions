import java.io.*;
import java.util.*;
public class lamps {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] hP = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scan.close();
		int i = 1;
		while(true) {
			int hours = i * hP[0];
			int bulbsInc = hours / 1000 + (hours % 1000 != 0 ? 1 : 0);
			int bulbsLow = hours / 8000 + (hours % 8000 != 0 ? 1 : 0);
			double elecInc = 60 * hours * hP[1] / 100000.0;
			double elecLow = 11 * hours * hP[1] / 100000.0;
			double costInc = bulbsInc * 5 + elecInc;
			double costLow = bulbsLow * 60 + elecLow;
			if(costLow < costInc) {
				System.out.println(i);
				break;
			}
			i++;
		}
	}
}