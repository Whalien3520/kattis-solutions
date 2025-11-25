import java.io.*;
import java.math.*;
import java.util.*;

public class popkorn {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        BigInteger n = new BigInteger(br.readLine()), four = new BigInteger("4");
        n = n.divide(four);
        System.out.println(n.multiply(n.subtract(BigInteger.ONE)).multiply(new BigInteger("2")).add(four));
    }
}