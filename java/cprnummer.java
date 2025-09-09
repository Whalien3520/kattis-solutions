import java.io.*;
import java.util.*;

public class cprnummer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int[] m = new int[] {4, 3, 2, 7, 6, 5, 0, 4, 3, 2, 1};
        int ret = 0;
        for(int i = 0; i < c.length; i++) {
            if(i == 6)
                continue;
            ret += (c[i] - '0') * m[i];
        }
        System.out.println(ret % 11 == 0 ? 1 : 0);
    }
}