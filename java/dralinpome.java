import java.io.*;
import java.math.*;
import java.util.*;

public class dralinpome {
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
        char[] S = next().toCharArray();
        int[] a = new int[26];
        for(char c : S)
            a[c - 'a']++;
        int o = 0;
        for(int i : a)
            if(i % 2 == 1)
                o++;
        sb.append(o > 1 ? "no" : "yes");
        System.out.print(sb);
    }
}