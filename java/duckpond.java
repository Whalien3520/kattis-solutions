import java.io.*;
import java.math.*;
import java.util.*;

public class duckpond {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // next and ret don't use index 0
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), ret = new int[nm[0] + 1];
        boolean[] v = new boolean[nm[0] + 1];
        int cur = 0;
        for(int i = 1; i <= nm[0]; i++) {
            for(int j = 0; j < nm[1]; j++)
                do {
                    cur = (cur % nm[0]) + 1;
                } while (v[cur]);
            ret[cur] = i;
            v[cur] = true;
        }
        for(int i = 1; i <= nm[0]; i++)
            System.out.print(ret[i] + " ");
    }
}