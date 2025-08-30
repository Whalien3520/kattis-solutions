import java.io.*;
import java.util.*;

public class deathknight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ret = n;
        while(n-- > 0) {
            char[] r = br.readLine().toCharArray();
            boolean flag = false;
            for(char c : r) {
                if(c == 'C')
                    flag = true;
                else {
                    if(c == 'D' && flag) {
                        ret--;
                        break;
                    }
                    flag = false;
                }
            }
        }
        System.out.println(ret);
    }
}