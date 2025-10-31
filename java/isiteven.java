import java.io.*;
import java.math.*;
import java.util.*;

public class isiteven {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(NK[0]-- > 0 && NK[1] > 0) {
            int x = Integer.parseInt(br.readLine());
            while((x & 1) == 0 && x > 0) {
                NK[1]--;
                x >>= 1;
            }
        }
        bw.write(NK[1] > 0 ? "0\n" : "1\n");
        bw.flush();
    }
}