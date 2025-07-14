import java.io.*;
import java.util.*;

public class sumkindofproblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        for(int i = 1; i <= P; i++) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int S1 = a[1] * (a[1] + 1) / 2, S3 = S1 * 2, S2 = S3 - a[1];
            System.out.println(i + " " + S1 + " " + S2 + " " + S3);
        }
    }
}