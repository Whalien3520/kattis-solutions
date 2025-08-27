import java.io.*;
import java.util.*;

public class trulstrubbel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int T = 0, H = 0;
        for(char c : a) {
            if(c == 'T')
                T++;
            else
                H++;
            if(Math.abs(T - H) >= 2 && (T >= 11 || H >= 11)) {
                T = 0;
                H = 0;
            }
        }
        System.out.println(T + "-" + H);
    }
}