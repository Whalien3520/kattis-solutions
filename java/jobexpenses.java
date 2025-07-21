import java.io.*;
import java.util.*;

public class jobexpenses {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if(t == 0) {
            System.out.println(0);
            return;
        }
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        for(int i : a)
            if(i < 0)
                ret -= i;
        System.out.println(ret);
    }
}