import java.io.*;
import java.math.*;
import java.util.*;

public class misty {
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
        int n = nextInt(), m = nextInt();
        sb.append((n - 1) + "\n");
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (Integer.compare(a[2], b[2])));
        for(int i = 1; i <= m; i++)
            pq.add(new int[] {nextInt(), nextInt(), nextInt(), i});
        int[] r = new int[n + 1];
        for(int i = 1; i <= n; i++)
            r[i] = i;
        for(int i = 1; i < n; i++) {
            int a = -1, b = -1, d = -1;
            while(d == -1) {
                int[] c = pq.poll();
                a = c[0];
                b = c[1];
                while(c[0] != r[c[0]]) {
                    r[c[0]] = r[r[c[0]]];
                    c[0] = r[c[0]];
                }
                while(c[1] != r[c[1]]) {
                    r[c[1]] = r[r[c[1]]];
                    c[1] = r[c[1]];
                }
                if(c[0] != c[1]) {
                    r[c[0]] = c[1];
                    d = c[3];
                }
            }
            sb.append(d + "\n");
        }
        System.out.print(sb);
    }
}