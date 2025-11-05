import java.io.*;
import java.math.*;
import java.util.*;

public class fractalarea {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int[] rn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double init = Math.PI * rn[0] * rn[0];
            bw.write(String.format("%f\n", init + init * (1 - Math.pow(0.75, rn[1] - 1)) * 4));
        }
        bw.flush();
    }
}