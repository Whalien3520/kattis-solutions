import java.io.*;
import java.util.*;

public class intuitiveelements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            char[] a = br.readLine().toCharArray();
            int p = 0;
            for(char c : a)
                p |= 1 << (c - 'a');
            a = br.readLine().toCharArray();
            boolean flag = true;
            for(int i = 0; flag && i < a.length; i++)
                flag = ((p >> (a[i] - 'a')) & 1) == 1;
            System.out.println(flag ? "YES" : "NO");
        }
    }
}