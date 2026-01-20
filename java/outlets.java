import java.io.*;
import java.math.*;
import java.util.*;

public class outlets {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int ret = 1, a;
        while(N-- > 0) {
            a = Integer.parseInt(br.readLine());
            if(a > 1)
                ret += a - 1;
        }
        System.out.println(ret);
    }
}