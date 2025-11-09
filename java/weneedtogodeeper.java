import java.io.*;
import java.math.*;
import java.util.*;

public class weneedtogodeeper {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(br.readLine()), ret = 0;
        for(int w = 4; w <= 23; w++)
            for(int h = 5; h <= 23; h++) {
                if(x < 2 * (h + w - 2))
                    break;
                ret++;
            }
        bw.write(String.format("%d\n", ret));
        bw.flush();
    }
}