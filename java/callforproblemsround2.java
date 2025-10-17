import java.io.*;
import java.util.*;

public class callforproblemsround2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] b = new boolean[51];
        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m = 0;
        while(nk[0]-- > 0) {
            int i = Integer.parseInt(br.readLine());
            if(!b[i]) {
                b[i] = true;
                m++;
            }
        }
        System.out.println(Math.min(m, nk[1]));
    }
}