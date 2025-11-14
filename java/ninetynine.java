import java.io.*;
import java.math.*;
import java.util.*;

public class ninetynine {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int p = 0;
        while(p % 3 == 0) {
            bw.write(String.format("%d\n", p + 1 + Math.round(Math.random())));
            bw.flush();
            p = Integer.parseInt(br.readLine());
        }
        while(p < 97) {
            bw.write(String.format("%d\n", p + 3 - (p % 3)));
            bw.flush();
            p = Integer.parseInt(br.readLine());
        }
        bw.write("99\n");
        bw.flush();
    }
}