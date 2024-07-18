import java.io.*;
import java.math.*;
import java.util.*;
public class anagramcounting {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = r.readLine()) != null) {
            int[] counts = new int[52];
            for(char c : s.toCharArray()) {
                if('A' <= c && c <= 'Z')
                    counts[c - 'A']++;
                else if('a' <= c && c <= 'z')
                    counts[c - 'a' + 26]++;
                else {
                    System.out.println("error");
                    return;
                }
            }
            BigInteger ret = BigInteger.ONE;
            int rem = s.length();
            for(int c : counts) {
                if(c == 0)
                    continue;
                for(int n = rem; n > c; n--)
                    ret = ret.multiply(BigInteger.valueOf(n));
                for(int n = rem - c; n > 1; n--)
                    ret = ret.divide(BigInteger.valueOf(n));
                rem -= c;
            }
            System.out.println(ret);
        }
    }
}