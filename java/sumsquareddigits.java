import java.io.*;
import java.util.*;

public class sumsquareddigits {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        while(P-- > 0) {
            int[] Kbn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            long ret = 0;
            while(Kbn[2] > 0) {
                int t = Kbn[2] % Kbn[1];
                Kbn[2] /= Kbn[1];
                ret += t * t;
            }
            System.out.println(Kbn[0] + " " + ret);
        }
    }
}