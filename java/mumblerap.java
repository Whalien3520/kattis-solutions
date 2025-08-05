import java.io.*;
import java.util.*;

public class mumblerap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] a = br.readLine().toCharArray();
        int ret = 0, cur = 0;
        for(char c : a) {
            if('0' <= c && c <= '9') {
                cur = cur * 10 + c - '0';
                ret = Math.max(ret, cur);
            }
            else
                cur = 0;
        }
        System.out.println(ret);
    }
}