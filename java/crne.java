import java.io.*;
import java.util.*;
import java.math.*;
public class crne {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        if(N == 1) {
            System.out.println(2);
            return;
        }
        BigInteger x1 = BigInteger.valueOf((N / 2) + 1);
        BigInteger x2 = BigInteger.valueOf((N / 2) + ((N % 2 == 0) ? 1 : 2));
        System.out.println(x1.multiply(x2));
    }
}