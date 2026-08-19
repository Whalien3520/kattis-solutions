import java.io.*;
import java.math.*;
import java.util.*;

public class koehandel {
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
        int c = nextInt(), n = nextInt();
        sb.append(n > c ? c + 1 : n < c ? 0 : n);
        System.out.print(sb);
    }
}