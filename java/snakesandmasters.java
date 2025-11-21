import java.io.*;
import java.math.*;
import java.util.*;

public class snakesandmasters {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine()), p = 1, c = 1;
        while(N-- > 1) {
            int i = (p + c) % 1000000;
            p = c;
            c = i;
        }
        System.out.println(c);
    }
}