import java.io.*;
import java.util.*;

public class zamka {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int L = Integer.parseInt(br.readLine()), D = Integer.parseInt(br.readLine()), X = Integer.parseInt(br.readLine()), N = L, M = D;
        while(digitSum(N) != X)
            N++;
        while(digitSum(M) != X)
            M--;
        System.out.println(N);
        System.out.println(M);
    }
    private static int digitSum(int a) {
        int ret = 0;
        while(a > 0) {
            ret += a % 10;
            a /= 10;
        }
        return ret;
    }

}
