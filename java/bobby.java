import java.io.*;
import java.util.*;
public class bobby {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		while(n-- > 0) {
			int[] rsxyw = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			double rollOdd = (double)(rsxyw[1] - rsxyw[0] + 1) / rsxyw[1];
			//System.out.println(rollOdd);
			//System.out.println(prob(rsxyw[2], rsxyw[3], rollOdd));
			System.out.println(rsxyw[4] * prob(rsxyw[2], rsxyw[3], rollOdd) > 1 ? "yes" : "no");
		}
	}
	public static double prob(int x, int y, double odds) {
		double ret = 0;
		for(; x <= y; x++) {
			double prob = 1;
			for(int i = 0; i < x; i++)
				prob *= odds;
			for(int i = x; i < y; i++)
				prob *= (1 - odds);
			
			int comb = 1;
			for(int i = 2; i <= y; i++)
				comb *= i;
			for(int i = 2; i <= x; i++)
				comb /= i;
			for(int i = 2; i <= (y - x); i++)
				comb /= i;
			
			ret += prob * comb;
		}
		return ret;
	}
}
