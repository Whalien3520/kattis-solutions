import java.io.*;
import java.util.*;

public class speeding {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ret = 0;
        br.readLine();
        int[] p = new int[] {0, 0};
        while(--n > 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ret = Math.max(ret, (a[1] - p[1]) / (a[0] - p[0]));
            p = a;
        }
        System.out.println(ret);
    }
}