import java.io.*;
import java.util.*;

public class fallingapart {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(r);
        int a = 0, b = 0;
        for(int i = 0; i < r.length; i++) {
            if(i % 2 == 0)
                a += r[r.length - 1 - i];
            else
                b += r[r.length - 1 - i];
        }
        System.out.println(a + " " + b);
    }
}