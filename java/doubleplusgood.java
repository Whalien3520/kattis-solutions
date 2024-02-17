import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class doubleplusgood {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] s = scan.readLine().split("\\+");
		int ret = 0;
		HashSet<BigInteger> set = new HashSet<>();
		for(int i = 0; i < Math.pow(2, s.length - 1); i++) {
			BigInteger eval = evaluate(s, i);
			if(!set.contains(eval)) {
				set.add(eval);
				ret++;
			}
		}
		System.out.println(ret);
		scan.close();
	}
	public static BigInteger evaluate(String[] s, int mask) {
		BigInteger ret = BigInteger.ZERO;
		String cur = s[0];
		for(int i = 1; i < s.length; i++, mask >>= 1) {
			if(mask % 2 == 0) {
				ret = ret.add(new BigInteger(cur));
				cur = s[i];
				continue;
			}
			cur += s[i];
		}
		if(!cur.equals(""))
			ret = ret.add(new BigInteger(cur));
		return ret;
	}
}
