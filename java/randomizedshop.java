import java.io.*;
import java.math.*;
import java.util.*;

public class randomizedshop {
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
    static long nextLong() {
        return Long.parseLong(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        long N = nextLong(), M = nextLong();
        long[] C = new long[(int)N];
        for(int i = 0; i < N; i++)
            C[i] = nextLong();
        List<long[]> CD = new ArrayList<>();
        for(int i = 0; i < N; i++)
            CD.add(new long[] {C[i], nextLong()});
        Collections.sort(CD, (a, b) -> (Long.compare(a[0], b[0])));
        for(long[] cd : CD)
            if(cd[1] > cd[0] && cd[0] <= M)
                M += cd[1] - cd[0];
        sb.append(M);
        System.out.print(sb);
    }
}