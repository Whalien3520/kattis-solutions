import java.io.*;
import java.util.*;

public class bracketmatching {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] a = br.readLine().toCharArray();
        int[] n = new int[a.length];
        int d = -1;
        String o = "([{", c = ")]}";
        for(int i = 0; i < a.length; i++) {
            if(o.indexOf(a[i]) > -1)
                n[++d] = i;
            else if(d == -1 || o.indexOf(a[n[d--]]) != c.indexOf(a[i])) {
                System.out.println("Invalid");
                return;
            }
        }
        System.out.println(d == -1 ? "Valid" : "Invalid");
    }
}