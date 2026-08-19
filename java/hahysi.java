import java.io.*;
import java.math.*;
import java.util.*;

public class hahysi {
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
    static long nextLong() {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        long n = nextLong(), nn = n - 1, m = nextLong(), mm = m - 1, c = 1000000007;
        sb.append((((n % c) * (nn % c) / 2) % c) * (((m % c) * (mm % c) / 2) % c) % c);
        System.out.print(sb);
    }
}