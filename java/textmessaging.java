import java.io.*;
import java.math.*;
import java.util.*;

public class textmessaging {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for(int n = 1; n <= N; n++) {
            int[] PKL = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long[] f = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
            Arrays.sort(f);
            long ret = 0;
            for(int i = 0; i < PKL[2]; i++)
                ret += f[f.length - i - 1] * (i / PKL[1] + 1);
            bw.write(String.format("Case #%d: %d\n", n, ret));
        }
        bw.flush();
    }
}