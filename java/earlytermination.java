import java.io.*;
import java.math.*;
import java.util.*;

public class earlytermination {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        long[] abk = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        abk[2] = (int)Math.sqrt(abk[2]);
        if(abk[0] < abk[1]) {
            abk[0] ^= abk[1];
            abk[1] ^= abk[0];
            abk[0] ^= abk[1];
        }
        while(abk[0] > abk[2]) {
            long i = abk[0] % abk[1];
            abk[0] = abk[1];
            abk[1] = i;
        }
        bw.write(String.format("%d %d\n", abk[0], abk[1]));
        bw.flush();
    }
}