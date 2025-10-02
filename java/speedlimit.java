import java.io.*;
import java.util.*;

public class speedlimit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while((n = Integer.parseInt(br.readLine())) != -1) {
            int ret = 0, p = 0;
            while(n-- > 0) {
                int[] st = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                ret += (st[1] - p) * st[0];
                p = st[1];
            }
            System.out.println(ret + " miles");
        }
    }
}