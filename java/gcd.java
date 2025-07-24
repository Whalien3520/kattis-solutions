import java.io.*;
import java.util.*;

public class gcd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(rec(ab[0], ab[1]));
    }
    private static int rec(int a, int b) {
        if(a == 0)
            return b;
        return rec(b % a, a);
    }
}