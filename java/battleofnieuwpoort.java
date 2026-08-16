import java.io.*;
import java.math.*;
import java.util.*;

public class battleofnieuwpoort {
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
        int y = nextInt();
        for(int i = 16; i >= 2; i--)
            if(y % i == 0 && y % (i * i) == 0) {
                for(; y > 0; y /= i)
                    sb.append(y % i < 10 ? Integer.toString(y % i) : (char)('a' + ((y % i) - 10)));
                sb.reverse();
                sb.insert(0, i + " ");
                break;
            }
        System.out.print(sb.length() == 0 ? "impossible" : sb);
    }
}