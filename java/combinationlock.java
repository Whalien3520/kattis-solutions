import java.io.*;
import java.math.*;
import java.util.*;

public class combinationlock {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    private static String next() {
        if(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    private static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int p = nextInt(), a = nextInt(), b = nextInt(), c = nextInt();
        while(a != b) {
            int ret = 1080 + (p - a) * 9 + (b - a) * 9 + (b - c) * 9;
            ret += a > p ? 40 * 9 : 0;
            ret += a > b ? 40 * 9 : 0;
            ret += c > b ? 40 * 9 : 0;
            sb.append(ret + "\n");
            
            p = nextInt();
            a = nextInt();
            b = nextInt();
            c = nextInt();
        }
        System.out.print(sb);
    }
}