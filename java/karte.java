import java.io.*;
import java.util.*;

public class karte {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] PKHT = new boolean[4][13];
        char[] r = br.readLine().toCharArray();
        for(int i = 0; i < r.length; i += 3) {
            boolean[] a = r[i] == 'P' ? PKHT[0] : (r[i] == 'K' ? PKHT[1] : (r[i] == 'H' ? PKHT[2] : PKHT[3]));
            int n = Integer.parseInt(r[i + 1] + "" + r[i + 2]) - 1;
            if(a[n] == true) {
                System.out.println("GRESKA");
                return;
            }
            a[n] = true;
        }
        for(boolean[] a : PKHT) {
            int c = 0;
            for(boolean b : a)
                c += b ? 0 : 1;
            System.out.print(c + " ");
        }
    }
}