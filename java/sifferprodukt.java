import java.io.*;
import java.util.*;

public class sifferprodukt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        while(x >= 10) {
            int y = 1;
            while(x > 0) {
                y *= x % 10 == 0 ? 1 : x % 10;
                x /= 10;
            }
            x = y;
        }
        System.out.println(x);
    }
}