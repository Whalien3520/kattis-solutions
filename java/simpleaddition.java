import java.io.*;
import java.math.*;
import java.util.*;

public class simpleaddition {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println((new BigInteger(br.readLine())).add(new BigInteger(br.readLine())));
    }
}