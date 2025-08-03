import java.io.*;
import java.util.*;

public class upprodun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine()), q = M / N, r = M % N;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < q + 1; j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i = N; i > r; i--) {
            for(int j = 0; j < q; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}