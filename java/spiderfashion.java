import java.io.*;
import java.math.*;
import java.util.*;

public class spiderfashion {
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
        int l = nextInt(), n = nextInt(), m = nextInt();
        if(Math.min(n, m) < 2 || l == 9 && Math.min(n, m) < 3) {
            System.out.println(-1);
            return;
        }
        sb.append(l == 8 ? "2\n1 2 1 2 1 2 1 2\n2 1 2 1 2 1 2 1" : "3\n1 2 3 1 2 3 1 2 3\n2 3 1 2 3 1 2 3 1");
        System.out.print(sb);
    }
}