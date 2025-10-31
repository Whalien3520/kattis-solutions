import java.io.*;
import java.math.*;
import java.util.*;

public class namegeneration {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        char[] c = "bcdfghjklmnpqrstvwxyz".toCharArray();
        int w = 0, x = 0, y = 0, z = 0;
        while(N-- > 0) {
            bw.write(c[w] + "" + c[x] + "a" + c[y] + "" + c[z] + "\n");
            if(z == 20) {
                if(y == 20) {
                    if(x == 20)
                        w++;
                    x = (x + 1) % 21;
                }
                y = (y + 1) % 21;
            }
            z = (z + 1) % 21;
        }
        bw.flush();
    }
}