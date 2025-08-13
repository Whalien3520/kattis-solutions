import java.io.*;
import java.util.*;

public class prsteni {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 1; i < a.length; i++) {
            int t = gcd(a[0], a[i]);
            System.out.println((a[0] / t) + "/" + (a[i] / t));
        }
    }
    private static int gcd(int a, int b) {
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }
}