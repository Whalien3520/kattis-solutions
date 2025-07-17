import java.io.*;
import java.util.*;

public class hangingout {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] Lx = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0, cur = 0;
        while(Lx[1]-- > 0) {
            String[] a = br.readLine().split(" ");
            int p = Integer.parseInt(a[1]);
            if(a[0].charAt(0) == 'e') {
                if(Lx[0] - cur < p)
                    ret++;
                else
                    cur += p;
            }
            else
                cur -= p;
        }
        System.out.println(ret);
    }
}