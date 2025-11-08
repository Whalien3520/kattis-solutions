import java.io.*;
import java.math.*;
import java.util.*;

public class areyoulistening {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] xyn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), min = new int[3];
        Arrays.fill(min, Integer.MAX_VALUE);
        while(xyn[2]-- > 0 && min[2] > 0) {
            int[] xyr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int d = Math.max(0, (int)Math.sqrt(Math.pow(xyn[0] - xyr[0], 2) + Math.pow(xyn[1] - xyr[1], 2)) - xyr[2]);
            for(int i = 0; i < 3; i++)
                if(d < min[i]) {
                    for(int j = 2; j > i; j--)
                        min[j] = min[j - 1];
                    min[i] = d;
                    break;
                }
        }
        bw.write(String.format("%d\n", min[2]));
        bw.flush();
    }
}