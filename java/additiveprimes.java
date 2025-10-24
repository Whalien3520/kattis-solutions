import java.io.*;
import java.math.*;
import java.util.*;

public class additiveprimes {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(long i = 2; i * i <= n; i++)
            if(n % i == 0) {
                System.out.println("COMPOSITE");
                return;
            }
        int sum = 0;
        while(n > 0) {
            sum += n % 10;
            n /= 10;
        }
        for(long i = 2; i * i <= sum; i++)
            if(sum % i == 0) {
                System.out.println("PRIME, BUT NOT ADDITIVE");
                return;
            }
        System.out.println("ADDITIVE PRIME");
    }
}