import java.io.*;
import java.math.*;
import java.util.*;

public class catalan {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BigInteger[] c = new BigInteger[5001];
        c[0] = BigInteger.ONE;
        BigInteger two = c[0].add(BigInteger.ONE), n = BigInteger.ZERO;
        for(int i = 1; i <= 5000; i++) {
            c[i] = c[i - 1].multiply(two.multiply(two.multiply(n).add(BigInteger.ONE))).divide(n.add(two));
            n = n.add(BigInteger.ONE);
        }
        int q = Integer.parseInt(br.readLine());
        while(q-- > 0)
            bw.write(String.format("%s\n", c[Integer.parseInt(br.readLine())].toString()));
        bw.flush();
    }
}