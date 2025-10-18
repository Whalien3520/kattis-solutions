import java.io.*;
import java.util.*;

public class treasurehunt2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] c = center(br, bw);
        bw.write(String.format("? %d %d\n", c[0] - 1, c[1]));
        bw.write(String.format("? %d %d\n", c[0], c[1] - 1));
        bw.flush();
        boolean u = br.readLine().charAt(0) == '1', l = br.readLine().charAt(0) == '1';
        bw.write(String.format("! %d %d\n", u ? c[0] - 1 : c[0], l ? c[1] - 1 : c[1]));
        bw.flush();
    }
    private static int[] center(BufferedReader br, BufferedWriter bw) throws IOException {
        int[] ret = new int[] {4, 4};
        bw.write("? 2 2\n");
        bw.flush();
        if(br.readLine().charAt(0) == '1') {
            ret[0] = 2;
            ret[1] = 2;
            return ret;
        }
        bw.write("? 2 4\n");
        bw.flush();
        if(br.readLine().charAt(0) == '1') {
            ret[0] = 2;
            return ret;
        }
        bw.write("? 4 2\n");
        bw.flush();
        if(br.readLine().charAt(0) == '1') {
            ret[1] = 2;
            return ret;
        }
        return ret;
    }
}