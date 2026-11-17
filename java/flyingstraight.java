import java.io.*;
import java.math.*;
import java.util.*;

public class flyingstraight {
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
    private static double nextDouble() {
        return Double.parseDouble(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        double c = Math.PI * 2 * 6378137, F = nextDouble(), G = nextDouble(), T = nextDouble(), d = G * T;
        while(d >= c)
            d -= c;
        d = d / c * 2 * Math.PI;
        double x = Math.cos(d) * 6378137, y = Math.sin(d) * 6378137;
        sb.append(Math.sqrt(Math.pow(6378137 - x, 2) + Math.pow(F * T - y, 2)));
        System.out.print(sb);
    }
}