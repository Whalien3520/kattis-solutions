import java.io.*;
import java.util.*;

public class hairofthedog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ret = 0;
        boolean p = true;
        while(N-- > 0) {
            boolean b = br.readLine().equals("sober");
            if(b && !p)
                ret++;
            p = b;
        }
        System.out.println(ret);
    }
}