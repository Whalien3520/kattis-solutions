import java.io.*;
import java.math.*;
import java.util.*;

public class standings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            br.readLine();
            int N = Integer.parseInt(br.readLine());
            int[] a = new int[N + 1];
            for(int i = 1; i <= N; i++)
                a[i] = Integer.parseInt(br.readLine().split(" ")[1]);
            Arrays.sort(a);
            long ret = 0;
            for(int i = 1; i <= N; i++)
                ret += Math.abs(i - a[i]);
            bw.write(String.format("%d\n", ret));
        }
        bw.flush();
    }
}