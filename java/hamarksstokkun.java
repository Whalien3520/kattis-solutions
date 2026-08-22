import java.io.*;
import java.math.*;
import java.util.*;

public class hamarksstokkun {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    static String next() {
        if(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int n = nextInt();
        String[] c = new String[n];
        while(n-- > 0)
            c[n] = next();
        for(String s : c)
            sb.append(s + " ");
        System.out.print(sb);
    }
}