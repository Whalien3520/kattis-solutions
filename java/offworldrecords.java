import java.io.*;
import java.util.*;

public class offworldrecords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ncp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        while(ncp[0]-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if(n > ncp[1] + ncp[2]) {
                ret++;
                ncp[2] = ncp[1];
                ncp[1] = n;
            }
        }
        System.out.println(ret);
    }
}