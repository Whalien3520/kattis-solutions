import java.io.*;
import java.math.*;
import java.util.*;

public class tracinglaserpointers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Map<Double, String> map = new HashMap<>();
        List<Double> l = new ArrayList<>();
        while(N-- > 0) {
            String[] a = br.readLine().split(" ");
            double x = Double.parseDouble(a[0]), y = Double.parseDouble(a[1]), m = Double.parseDouble(a[2]);
            if(m == 0 || (y > 0 == m > 0))
                continue;
            double d = -y / m + x;
            l.add(d);
            map.put(d, a[3]);
        }
        StringBuilder sb = new StringBuilder();
        Collections.sort(l);
        for(double d : l)
            sb.append(map.get(d) + "\n");
        System.out.println(sb);
    }
}