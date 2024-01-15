import java.io.*;
import java.math.BigInteger;
public class allaboutthatbase {
	static String alphabet = "0123456789abcdefghijklmnopqrstuvwxyz0";
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		BigInteger maxOp = BigInteger.ONE;
		for(int i = 0; i < 32; i++)
			maxOp = maxOp.multiply(BigInteger.valueOf(2));
		maxOp = maxOp.subtract(BigInteger.valueOf(1));
		while(N-- > 0) {
			String[] arr = scan.readLine().split(" ");
			int base = Math.max(Math.max(minBase(arr[0]), minBase(arr[2])), minBase(arr[4])) - 1;
			boolean valid = false;
			while(++base < 37) {
				BigInteger x = convert(arr[0], base), y = convert(arr[2], base), z = convert(arr[4], base);
				if(x.compareTo(maxOp) > 0 || y.compareTo(maxOp) > 0 || z.compareTo(maxOp) > 0)
					continue;
				boolean b = false;
				switch(arr[1]) {
				case "+":
					b = x.add(y).compareTo(z) == 0;
					break;
				case "-":
					b = x.subtract(y).compareTo(z) == 0;
					break;
				case "*":
					b = x.multiply(y).compareTo(z) == 0;
					break;
				case "/":
					b = x.divide(y).compareTo(z) == 0 && x.mod(y).compareTo(BigInteger.ZERO) == 0;
					break;
				default:
					System.out.println("invalid operation");
					System.exit(1);
				}
				if(b) {
					System.out.print(alphabet.charAt(base));
					valid = true;
				}
			}
			if(!valid)
				System.out.print("invalid");
			System.out.println();
		}
		scan.close();
	}
	public static int minBase(String s) {
		int ret = 0;
		for(char c : s.toCharArray()) {
			if(Character.isDigit(c))
				ret = Math.max(ret, c - '0' + 1);
			else
				ret = Math.max(ret, c - 'a' + 11);
		}
		if(ret == 0) {
			System.out.println("minBase attmpted to return 0; exiting");
			System.exit(1);
		}
		if(ret == 2 && s.indexOf('0') == -1)
			return 1;
		return ret;
	}
	public static BigInteger convert(String s, int base) {
		if(base == 1)
			return BigInteger.valueOf(s.length());
		BigInteger ret = BigInteger.ZERO;
		String lookup = alphabet.substring(0, base);
		BigInteger stringBase = BigInteger.ONE;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(s.length() - i - 1);
			int dig = lookup.indexOf(c);
			ret = ret.add(stringBase.multiply(BigInteger.valueOf(dig)));
			stringBase = stringBase.multiply(BigInteger.valueOf(base));
		}
		return ret;
	}
}
