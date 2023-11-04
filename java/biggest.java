import java.util.*;
import java.io.*;
public class biggest {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(scan.readLine());
		while(m-- > 0) {
			int[] rntms = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			boolean[] cuts = new boolean[360 * 60 * 60];
			int interval = rntms[2] * 60 * 60 + rntms[3] * 60 + rntms[4];
			if(rntms[1] > 360*60*60)
				rntms[1] = 360*60*60;
			for(int i = 0, j = 0; i < rntms[1]; i++, j = (j + interval) % (360*60*60))
				cuts[j] = true;
			
			int last = 0, max = 0;
			for(int i = 1; i < 360*60*60; i++)
				if(cuts[i]) {
					max = Math.max(i - last, max);
					last = i;
				}
			max = Math.max(360*60*60 - last, max);
			System.out.println((max / (360.0*60*60)) * Math.PI * Math.pow(rntms[0], 2));
		}
	}
}
