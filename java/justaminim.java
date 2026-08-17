import java.io.*;
import java.math.*;
import java.util.*;

public class justaminim {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    private static String next() {
        while(!st.hasMoreTokens()) {
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
        int N = nextInt();
        double ret = 0;
        while(N-- > 0) {
            int i = nextInt();
            ret += 2 * (i == 0 ? 1 : Math.pow(0.5, 1 + Integer.numberOfTrailingZeros(i)));
        }
        sb.append(ret);
        System.out.print(sb);
    }
}