import java.io.*;
import java.util.*;

public class veci {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int[] c = new int[10];
        int max = 0;
        for(int i = a.length - 1; i >= 0; i--) {
            int n = a[i] - '0';
            c[n]++;
            if(n < max) {
                for(int j = max; j > n; j--)
                    if(c[j] > 0)
                        max = j;
                for(int j = 0; j < i; j++)
                    System.out.print(a[j]);
                System.out.print(max);
                c[max]--;
                for(int j = 0; j < c.length; j++)
                    for(int k = 0; k < c[j]; k++)
                        System.out.print(j);
                return;
            }
            if(n > max)
                max = n;
        }
        System.out.print(0);
    }
}