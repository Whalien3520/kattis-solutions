import java.io.*;
import java.util.*;

public class equalshots {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sa = 0, sb = 0;
        while(ab[0]-- > 0) {
            int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sa += t[0] * t[1];
        }
        while(ab[1]-- > 0) {
            int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sb += t[0] * t[1];
        }
        System.out.println(sa == sb ? "same" : "different");
    }
}