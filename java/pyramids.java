import java.io.*;
import java.util.*;

public class pyramids {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), l = 0, c = 0;
        while(c <= N) {
            c += (2 * l + 1) * (2 * l + 1);
            l++;
        }
        System.out.println(l - 1);
    }
}