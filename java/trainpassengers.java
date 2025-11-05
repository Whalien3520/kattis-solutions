import java.io.*;
import java.math.*;
import java.util.*;

public class trainpassengers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        solve();
        bw.flush();
    }
    private static void solve() throws IOException {
        int[] Cn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long cur = 0;
        while(Cn[1]-- > 1) {
            int[] ar = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(cur < ar[0]) {
                bw.write("impossible\n");
                return;
            }
            cur += ar[1] - ar[0];
            if(cur < 0 || cur > Cn[0] || (ar[2] > 0 && cur < Cn[0])) {
                bw.write("impossible\n");
                return;
            }
        }
        int[] ar = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        cur += ar[1] - ar[0];
        if(cur != 0 || ar[2] != 0)
                bw.write("impossible\n");
        else
                bw.write("possible\n");
    }
}