import java.io.*;
import java.math.*;
import java.util.*;

public class mandelbrot {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s;
        int c = 1;
        while((s = br.readLine()) != null) {
            String[] a = s.split(" ");
            double x = Double.parseDouble(a[0]), y = Double.parseDouble(a[1]), cx = 0, cy = 0, m = 0;
            int r = Integer.parseInt(a[2]);
            while(r-- > 0 && m <= 2) {
                double nx = cx * cx - cy * cy + x, ny = 2 * cx * cy + y;
                cx = nx;
                cy = ny;
                m = Math.max(m, Math.sqrt(cx * cx + cy * cy));
            }
            System.out.println(String.format("Case %d: %s", c++, m <= 2 ? "IN" : "OUT"));
        }
    }
}