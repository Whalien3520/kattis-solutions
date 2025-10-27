import java.io.*;
import java.math.*;
import java.util.*;

public class cursethedarkness {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int m = Integer.parseInt(br.readLine());
        while(m-- > 0) {
            double[] XY = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            int n = Integer.parseInt(br.readLine());
            boolean flag = true;
            while(n-- > 0) {
                String s = br.readLine();
                if(flag) {
                    double[] xy = Arrays.stream(s.split(" ")).mapToDouble(Double::parseDouble).toArray();
                    flag = Math.sqrt(Math.pow(XY[0] - xy[0], 2) + Math.pow(XY[1] - xy[1], 2)) > 8;
                }
            }
            System.out.println(flag ? "curse the darkness" : "light a candle");
        }
    }
}