import java.io.*;
import java.math.*;
import java.util.*;

public class eko {
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
    private static long nextLong() {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        int N = nextInt();
        long M = nextLong();
        long[] t = new long[N];
        for(int i = 0; i < N; i++)
            t[i] = nextLong();
        long l = 0, r = 2000000000;
        while(l <= r) {
            long p = (l + r) / 2, s = M;
            for(int i = 0; i < N && s > 0; i++)
                s -= Math.max(t[i] - p, 0);
            if(s > 0)
                r = p - 1;
            else
                l = p + 1;
        }
        sb.append((l - 1) + "\n");
        System.out.print(sb);
    }
}