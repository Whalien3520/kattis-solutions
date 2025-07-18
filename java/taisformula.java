import java.io.*;
import java.util.*;

public class taisformula {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double ret = 0;
        String[] a = br.readLine().split(" ");
        int pt = Integer.parseInt(a[0]);
        double pv = Double.parseDouble(a[1]);
        while(--N > 0) {
            a = br.readLine().split(" ");
            int t = Integer.parseInt(a[0]);
            double v = Double.parseDouble(a[1]);
            ret += (v + pv) / 2 * (t - pt);
            pt = t;
            pv = v;
        }
        System.out.println(ret / 1000);
    }
}