import java.io.*;
import java.util.*;

public class filip {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int a = (s[0].charAt(0) - '0') + (s[0].charAt(1) - '0') * 10 + (s[0].charAt(2) - '0') * 100, b = (s[1].charAt(0) - '0') + (s[1].charAt(1) - '0') * 10 + (s[1].charAt(2) - '0') * 100;
        System.out.println(a > b ? a : b);
    }
}