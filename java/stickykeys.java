import java.io.*;
import java.util.*;

public class stickykeys {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        char p = 0;
        for(int i = 0; i < a.length; i++)
            if(a[i] != p) {
                p = a[i];
                System.out.print(p);
            }
    }
}