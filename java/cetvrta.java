import java.io.*;
import java.util.*;

public class cetvrta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b = 0;
        for(int i = 0; i < 3; i++) {
            int[] r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            a ^= r[0];
            b ^= r[1];
        }
        System.out.println(a + " " + b);
    }
}