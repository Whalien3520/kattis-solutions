import java.io.*;
import java.math.*;
import java.util.*;

public class freckles {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            br.readLine();
            int n = Integer.parseInt(br.readLine());
            double[][] xy = new double[n][];
            for(int i = 0; i < n; i++)
                xy[i] = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double ret = 0;
            boolean[] v = new boolean[n];
            v[0] = true;
            PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(a[0], b[0]));
            for(int i = 1; i < n; i++)
                pq.add(new double[] {Math.sqrt(Math.pow(xy[i][0] - xy[0][0], 2) + Math.pow(xy[i][1] - xy[0][1], 2)), (double)i});
            int procd = 1;
            while(procd < n) {
                double[] c = pq.poll();
                int d = (int)c[1];
                if(v[d])
                    continue;
                procd++;
                v[d] = true;
                ret += c[0];
                for(int i = 1; i < n; i++)
                    if(!v[i])
                        pq.add(new double[] {Math.sqrt(Math.pow(xy[i][0] - xy[d][0], 2) + Math.pow(xy[i][1] - xy[d][1], 2)), (double)i});
            }
            System.out.println(String.format("%.2f", ret));
            System.out.println();
        }
    }
}