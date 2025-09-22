import java.io.*;
import java.util.*;

public class minesmotorcompany {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ret = 0;
        char[] p = br.readLine().toCharArray();
        while(--N > 0) {
            char[] c = br.readLine().toCharArray();
            ret += Math.abs(c[0] - p[0]) + Math.abs(c[1] - p[1]);
            p = c;
        }
        System.out.println(ret);
    }
}