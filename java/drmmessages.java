import java.io.*;
import java.util.*;

public class drmmessages {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int l = 0, r = 0;
        for(int i = 0; i < a.length / 2; i++)
            l += a[i] - 'A';
        l %= 26;
        for(int i = 0; i < a.length / 2; i++) {
            a[i] += l;
            if(a[i] > 'Z')
                a[i] -= 26;
        }
        for(int i = a.length / 2; i < a.length; i++)
            r += a[i] - 'A';
        r %= 26;
        for(int i = a.length / 2; i < a.length; i++) {
            a[i] += r;
            if(a[i] > 'Z')
                a[i] -= 26;
        }
        for(int i = 0; i < a.length / 2; i++) {
            a[i] += a[i + a.length / 2] - 'A';
            System.out.print((char)(a[i] <= 'Z' ? a[i] : (a[i] - 26)));
        }
    }
}