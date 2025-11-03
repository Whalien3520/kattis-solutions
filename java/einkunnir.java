import java.io.*;
import java.math.*;
import java.util.*;

public class einkunnir {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] SN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[] k = br.readLine().toCharArray();
        while(SN[1]-- > 0) {
            String n = br.readLine();
            double s = 0;
            char[] a = br.readLine().toCharArray();
            for(int i = 0; i < a.length; i += 2)
                if(a[i] == k[i])
                    s++;
            s = Math.round(s * 10.0 / SN[0] * 2) / 2.0;
            bw.write(String.format("%s: %.1f\n", n, s));
        }
        bw.flush();
    }
}