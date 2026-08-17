import java.io.*;
import java.math.*;
import java.util.*;

public class bikesandbarricades {
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
        Double ret = Double.MAX_VALUE;
        while(n-- > 0) {
            int x1 = nextInt(), y1 = nextInt(), x2 = nextInt(), y2 = nextInt();
            if((x1 < 0) == (x2 < 0))
                continue;
            double m = (double)(y2 - y1) / (x2 - x1), b = m * (0 - x1) + y1;
            if(b > 0 && b < ret)
                ret = b;
        }
        sb.append(ret == Double.MAX_VALUE ? -1 : ret);
        System.out.println(sb);
    }
}