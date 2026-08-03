import java.io.*;
import java.math.*;
import java.util.*;
public class hotsprings {
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
        int n = nextInt();
        int[] t = new int[n];
        for(int i = 0; i < n; i++)
            t[i] = nextInt();
        Arrays.sort(t);
        for(int i = n / 2, j = -1, k = 1; 0 <= i && i < n; i += j * k, j *= -1, k++)
            sb.append(t[i] + " ");
        System.out.print(sb);
    }
}