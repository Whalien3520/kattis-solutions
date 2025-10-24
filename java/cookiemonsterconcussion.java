import java.io.*;
import java.math.*;
import java.util.*;

public class cookiemonsterconcussion {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        long l = Long.parseLong(br.readLine());
        while(l >= 10) {
            int t = 0;
            while(l > 0) {
                t += l % 10;
                l /= 10;
            }
            l = t;
        }
        System.out.println(l);
    }
}