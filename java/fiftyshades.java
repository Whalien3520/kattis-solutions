import java.io.*;
import java.util.*;

public class fiftyshades {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ret = 0;
        while(N-- > 0) {
            String s = br.readLine().toLowerCase();
            ret += (s.indexOf("pink") > -1 || s.indexOf("rose") > -1) ? 1 : 0;
        }
        System.out.println(ret == 0 ? "I must watch Star Wars with my daughter" : ret);
    }
}