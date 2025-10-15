import java.io.*;
import java.util.*;

public class kmh {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), m = 10;
        while(N-- > 0) {
            String s = br.readLine();
            if(s.equals("/")) {
                System.out.println(m);
                continue;
            }
            System.out.println(s);
            int L = Integer.parseInt(s);
            m = m > L ? m : (L / 10 + 1) * 10;
        }
    }
}