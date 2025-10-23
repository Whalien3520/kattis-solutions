import java.io.*;
import java.math.*;
import java.util.*;

public class mingle {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static final long MOD = 998244353;
    public static void main(String[] args) throws IOException {
        long[] nk = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long m = 2 * nk[1] + 1, inv = binmodexp(m, MOD - 2);
        inv = (inv * (m - 1)) % MOD;
        System.out.println((nk[0] * binmodexp(inv, 2 * nk[1])) % MOD);
        
    }
    private static long binmodexp(long a, long b) {
        long ret = 1;
        while(b > 0) {
            if((b & 1) > 0)
                ret = (ret * a) % MOD;
            a = (a * a) % MOD;
            b >>= 1;
        }
        return ret;
    }
}