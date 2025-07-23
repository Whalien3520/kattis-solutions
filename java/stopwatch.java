import java.io.*;
import java.util.*;

public class stopwatch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ret = 0, p = 0, N = Integer.parseInt(br.readLine());
        boolean r = false;
        while(N-- > 0) {
            if(r)
                ret += Integer.parseInt(br.readLine()) - p;
            else
                p = Integer.parseInt(br.readLine());
            r = !r;
        }
        System.out.println(r ? "still running" : ret);
    }
}