import java.io.*;
import java.util.*;

public class numberreduction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()), ret = 0;
        while(N != 1) {
            N = N % 2 == 0 ? N / 2 : 3 * N + 1;
            ret++;
        }
        System.out.println(ret);
    }
}