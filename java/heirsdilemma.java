import java.io.*;
import java.util.*;

public class heirsdilemma {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        OUTERLOOP:
        for(int i = a[0]; i <= a[1]; i++) {
            boolean[] d = new boolean[10];
            int c = i;
            while(c > 0) {
                if(c % 10 == 0 || d[c % 10])
                    continue OUTERLOOP;
                d[c % 10] = true;
                c /= 10;
            }
            for(int j = 0; j < d.length; j++)
                if(d[j] && i % j > 0)
                    continue OUTERLOOP;
            ret++;
        }
        System.out.println(ret);
    }
}