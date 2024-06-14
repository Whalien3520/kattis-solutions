import java.io.*;
import java.util.*;
import java.math.*;
public class nine {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(r.readLine());
        while(T-- > 0) {
            BigInteger d = new BigInteger(r.readLine());
            if(d.compareTo(BigInteger.ONE) == 0) {
                System.out.println(8);
                continue;
            }
            BigInteger two = new BigInteger("2");
            d = d.subtract(BigInteger.ONE);
            BigInteger nine = new BigInteger("9");
            BigInteger ret = new BigInteger("1");
            BigInteger prime = new BigInteger("1000000007");
            while(d.compareTo(BigInteger.ZERO) != 0) {
                BigInteger mod = d.mod(two);
                if(mod.compareTo(BigInteger.ZERO) > 0)
                    ret = ret.multiply(nine).mod(prime);
                nine = nine.multiply(nine).mod(prime);
                d = d.divide(two);
            }
            ret = ret.multiply(new BigInteger("8")).mod(prime);
            System.out.println(ret);
        }
    }
}