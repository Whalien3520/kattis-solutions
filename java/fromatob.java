import java.io.*;
import java.math.*;
import java.util.*;

public class fromatob {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        while(ab[0] > ab[1]) {
            if(ab[0] % 2 == 1)
                ab[0]++;
            else
                ab[0] >>= 1;
            ret++;
        }
        bw.write(ret + ab[1] - ab[0] + "\n");
        bw.flush();
    }
}