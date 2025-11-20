import java.io.*;
import java.math.*;
import java.util.*;

public class candlebox {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int D = Integer.parseInt(br.readLine()), R = Integer.parseInt(br.readLine()), T = Integer.parseInt(br.readLine()), r = 0, t = 0, rx, tx, n = 3;
        for(int i = 0; i + 1 < D; i++)
            r += 4 + i;
        do {
            r += n + D;
            t += n++;
            rx = R - r;
            tx = t - T;
        } while(rx != tx);
        bw.write(String.format("%d\n", rx));
        bw.flush();
    }
}