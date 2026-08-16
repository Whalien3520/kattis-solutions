import java.io.*;
import java.math.*;
import java.util.*;
public class divisorcounts {
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
        int N = nextInt();
        int[] r = new int[N + 1];
        for(int i = 1; i <= N; i++) {
            for(int j = i; j <= N; j += i)
                r[j]++;
            sb.append(r[i] + "\n");
        }
        System.out.print(sb);
    }
}