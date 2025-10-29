import java.io.*;
import java.math.*;
import java.util.*;

public class lastminute {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        long[] ABAB = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        if(ABAB[2] == 0) {
            if(ABAB[3] == 0)
                bw.write(String.format("%d", Math.min(ABAB[0], ABAB[1])));
            else
                bw.write(String.format("%d", ABAB[0]));
        }
        else {
            if(ABAB[3] == 0)
                bw.write(String.format("%d", ABAB[1]));
            else
                bw.write(String.format("%d", ABAB[0] + ABAB[1] + ABAB[2] * ABAB[3]));
        }
        bw.flush();
    }
}