import java.io.*;
import java.math.*;
import java.util.*;

public class marathon3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        double[][] ab = new double[N][3];
        for(int i = 0; i < N; i++) {
            double[] t = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            ab[i][0] = t[0];
            ab[i][1] = t[1];
            ab[i][2] = t[1] - t[0];
        }
        double l = 0, r = 1e5;
        while((r - l) >= 1e-6) {
            double m = (l + r) / 2, c = 1;
            for(int i = 0; i < N && c >= 0.5; i++) {
                if(m <= ab[i][0])
                    continue;
                if(m >= ab[i][1])
                    c *= 0;
                else
                    c *= (ab[i][1] - m) / ab[i][2];
            }
            if(c >= 0.5)
                l = m;
            else
                r = m;
        }
        bw.write(String.format("%f\n", (l + r) / 2));
        bw.flush();
    }
}