import java.io.*;
import java.math.*;
import java.util.*;

public class taktsvedjur {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        long ret = 0, streak = 0, mult = 1;
        while(n-- > 0) {
            long x = Long.parseLong(br.readLine());
            if(x == 0) {
                mult = mult > 1 ? mult / 2 : 1;
                streak = 0;
            }
            else {
                streak++;
                if(mult < 8 && streak / 2 == mult) {
                    mult *= 2;
                    streak = 0;
                }
                ret += mult * x;
            }
        }
        bw.write(ret + "\n");
        bw.flush();
    }
}