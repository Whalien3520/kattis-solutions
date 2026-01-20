import java.io.*;
import java.math.*;
import java.util.*;

public class putovanje {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] NC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), w = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        for(int i = 0; i < NC[0]; i++) {
            int s = NC[1], n = 0;
            for(int j = i; j < NC[0]; j++)
                if(s >= w[j]) {
                    s -= w[j];
                    n++;
                }
            ret = Math.max(ret, n);
        }
        System.out.println(ret);
    }
}