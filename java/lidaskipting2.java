import java.io.*;
import java.math.*;
import java.util.*;
public class lidaskipting2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BigInteger i = new BigInteger(r.readLine());
        System.out.println(i);
        BigInteger ret = i.divide(BigInteger.valueOf(3));
        //System.out.println(ret);
        if(!(i.mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO)))
            ret = ret.add(BigInteger.ONE);
        System.out.println(ret);
    }
}