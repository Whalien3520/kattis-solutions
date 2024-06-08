import java.io.*;
import java.util.*;
public class bestagjofin {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        String s = "";
        int i = 1001;
        while(n-- > 0) {
            String[] in = r.readLine().split(" ");
            int fun = Integer.parseInt(in[1]);
            if(fun < i) {
                i = fun;
                s = in[0];
            }
        }
        System.out.println(s);
    }
}