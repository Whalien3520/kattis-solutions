import java.io.*;
import java.util.*;

public class busassignment {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), cur = 0, ret = 0;
        while(n-- > 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            cur -= a[0] - a[1];
            ret = Math.max(cur, ret);
        }
        System.out.println(ret);
    }
}