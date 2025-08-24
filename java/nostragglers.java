import java.io.*;
import java.util.*;

public class nostragglers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ret = 0;
        while(N-- > 0) {
            String[] s = br.readLine().split(" ");
            ret += Integer.parseInt(s[2]) * (s[1].equals("IN") ? 1 : -1);
        }
        System.out.println(ret == 0 ? "NO STRAGGLERS" : ret);
    }
}