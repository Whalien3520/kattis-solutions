import java.io.*;
import java.util.*;

public class heimavinna {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(";");
        int ret = 0;
        for(String s : a) {
            int[] t = Arrays.stream(s.split("-")).mapToInt(Integer::parseInt).toArray();
            if(t.length == 1)
                ret++;
            else
                ret += t[1] - t[0] + 1;
        }
        System.out.println(ret);
    }
}