import java.io.*;
import java.util.*;

public class electricaloutlets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int ret = 2 - a[0] - a.length;
            for(int o : a)
                ret += o;
            System.out.println(ret);
        }
    }
}