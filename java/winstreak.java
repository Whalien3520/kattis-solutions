import java.io.*;
import java.math.*;
import java.util.*;

public class winstreak {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine()), ret = 0, cur = 0;
        while(N-- > 0) {
            int[] ST = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(ST[0] > ST[1]) {
                cur++;
                continue;
            }
            ret = Math.max(ret, cur);
            cur = 0;
        }
        bw.write(String.format("%d\n", Math.max(ret, cur)));
        bw.flush();
    }
}