import java.io.*;
import java.util.*;

public class cypherdecypher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] s = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            char[] a = br.readLine().toCharArray();
            for(int i = 0; i < a.length; i++)
                System.out.print((char)((((a[i] - 'A') * s[i]) % 26) + 'A'));
            System.out.println();
        }
    }
}