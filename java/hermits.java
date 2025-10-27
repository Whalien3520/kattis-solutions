import java.io.*;
import java.math.*;
import java.util.*;

public class hermits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), b = a.clone();
        int M = Integer.parseInt(br.readLine());
        while(M-- > 0) {
            int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            b[c[0] - 1] += a[c[1] - 1];
            b[c[1] - 1] += a[c[0] - 1];
        }
        List<Integer> l = new ArrayList<>(N);
        for(int i = 0; i < N; i++)
            l.add(i);
        Collections.sort(l, (x, y) -> b[x] != b[y] ? Integer.compare(b[x], b[y]) : Integer.compare(x, y));
        bw.write((l.get(0) + 1) + "\n");
        bw.flush();
    }
}