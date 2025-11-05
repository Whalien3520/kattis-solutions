import java.io.*;
import java.math.*;
import java.util.*;

public class matrix {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        int i = 1;
        while((s = br.readLine()) != null) {
            int[] ab = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray(), cd = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            br.readLine();
            int det = ab[0] * cd[1] - ab[1] * cd[0];
            bw.write(String.format("Case %d:\n%d %d\n%d %d\n", i++, cd[1] / det, -ab[1] / det, -cd[0] / det, ab[0] / det));
        }
        bw.flush();
    }
}