import java.io.*;
import java.util.*;

public class shatteredcake {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int W = Integer.parseInt(br.readLine()), N = Integer.parseInt(br.readLine()), s = 0;
        while(N-- > 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            s += a[0] * a[1];
        }
        System.out.println(s / W);
    }
}