import java.io.*;
import java.util.*;

public class generalizedfizzbuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long [] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long fb = a[0] / (a[1] * a[2] / gcd(a[1], a[2]));
        System.out.println((a[0] / a[1] - fb) + " " + (a[0] / a[2] - fb) + " " + fb);
    }
    private static long gcd(long a, long b) {
        if(a == 0)
            return b;
        return gcd(b % a, a);
    }
}