import java.io.*;
import java.math.*;
import java.util.*;

public class hlaupafmaeli {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        long l = Long.parseLong(br.readLine());
        if(l % 4 != 0 || (l % 100 == 0 && l % 400 != 0))
            bw.write("Neibb\n");
        else {
            long a = (l - 2000) / 100, b = a / 4;
            bw.write(String.format("%d\n", (l - 2020) / 4 - a + b));
        }
        bw.flush();
    }
}