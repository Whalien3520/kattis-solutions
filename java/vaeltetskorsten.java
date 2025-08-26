import java.io.*;
import java.util.*;

public class vaeltetskorsten {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n  = Integer.parseInt(br.readLine()), ret = 0;
        while(n-- > 0) {
            String[] s = br.readLine().split(" ");
            if(s[1].equals("nej"))
                ret = Math.max(ret, Integer.parseInt(s[0]));
        }
        System.out.println(ret);
    }
}