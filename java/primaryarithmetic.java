import java.io.*;
import java.math.*;
import java.util.*;

public class primaryarithmetic {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        while(!(s = br.readLine()).equals("0 0")) {
            String[] a = s.split(" ");
            int ret = 0, i = -1, carry = 0;
            while(++i < a[0].length() || i < a[1].length()) {
                int c = (i < a[0].length() ? a[0].charAt(a[0].length() - i - 1) - '0' : 0) + (i < a[1].length() ? a[1].charAt(a[1].length() - i - 1) - '0' : 0) + carry;
                carry = c >= 10 ? 1 : 0;
                ret += carry;
            }
            bw.write(String.format("%s carry operation%s.\n", ret == 0 ? "No" : ret, ret > 1 ? "s" : ""));
        }
        bw.flush();
    }
}