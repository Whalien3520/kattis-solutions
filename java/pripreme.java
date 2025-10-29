import java.io.*;
import java.math.*;
import java.util.*;

public class pripreme {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(n);
        long s = 0;
        for(int i = 0; i < n.length - 1; i++)
            s += n[i];
        bw.write(String.valueOf(s >= n[n.length - 1] ? s + n[n.length - 1] : 2 * n[n.length - 1]));
        bw.flush();
    }
}