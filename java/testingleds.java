import java.io.*;
import java.util.*;

public class testingleds {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ret = -1;
        while(N-- > 0) {
            int[] MO = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ret = MO[1] == 1 ? ret : ret == -1 ? MO[0] : MO[0] < ret ? MO[0] : ret;
        }
        System.out.println(ret);
    }
}