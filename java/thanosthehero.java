import java.io.*;
import java.math.*;
import java.util.*;

public class thanosthehero {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        long ret = 0;
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = N - 2; i >= 0; i--) {
            if(a[i + 1] == 0) {
                System.out.println(1);
                return;
            }
            int t = a[i] - (a[i + 1] - 1);
            if(t > 0) {
                ret += t;
                a[i] -= t;
            }
        }
        System.out.println(ret);
    }
}