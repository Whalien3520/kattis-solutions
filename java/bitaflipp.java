import java.io.*;
import java.math.*;
import java.util.*;

public class bitaflipp {
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
        int N = nextInt(), s = 0;
        int[] l = new int[N];
        for(int i = 0; i < N; i++) {
            l[i] = nextInt();
            if(l[i] == 1) {
                l[i] = -1;
                s++;
            }
            else
                l[i] = 1;
        }
        int m = 0, r = Integer.MIN_VALUE;
        for(int i : l) {
            m = Math.max(i, m + i);
            r = Math.max(r, m);
        }
        sb.append(s + r);
        System.out.print(sb);
    }
}