import java.io.*;
import java.util.*;

public class zanzibar {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ret = 0;
            for(int i = 1; i < a.length - 1; i++) {
                int t = a[i] - 2 * a[i - 1];
                ret += t > 0 ? t : 0;
            }
            System.out.println(ret);
        }
    }

}
