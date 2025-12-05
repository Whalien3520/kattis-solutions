import java.io.*;
import java.math.*;
import java.util.*;

public class icouldhavewon {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        char[] s = br.readLine().toCharArray();
        List<Integer> ret = new ArrayList<>();
        for(int i = 1; i <= s.length; i++) {
            int a = 0, b = 0, aa = 0, bb = 0;
            for(char c : s) {
                if(c == 'A') {
                    if(++aa == i) {
                        a++;
                        aa = 0;
                        bb = 0;
                    }
                }
                else if(++bb == i) {
                        b++;
                        aa = 0;
                        bb = 0;
                    }
            }
            if(a > b)
                ret.add(i);
        }
        System.out.println(ret.size());
        if(ret.size() > 0) {
            StringBuilder sb = new StringBuilder();
            for(int i : ret)
                sb.append(i + " ");
            System.out.println(sb);
        }
    }
}