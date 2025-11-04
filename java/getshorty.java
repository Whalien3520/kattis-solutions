import java.io.*;
import java.math.*;
import java.util.*;

public class getshorty {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        while(!(s = br.readLine()).equals("0 0")) {
            int[] nm = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            List<List<Integer>> neighbors = new ArrayList<>(nm[0]);
            List<List<Double>> factors = new ArrayList<>(nm[0]);
            for(int i = 0; i < nm[0]; i++) {
                neighbors.add(new ArrayList<>());
                factors.add(new ArrayList<>());
            }
            while(nm[1]-- > 0) {
                String[] xyf = br.readLine().split(" ");
                int x = Integer.parseInt(xyf[0]), y = Integer.parseInt(xyf[1]);
                double f = Double.parseDouble(xyf[2]);
                neighbors.get(x).add(y);
                factors.get(x).add(f);
                neighbors.get(y).add(x);
                factors.get(y).add(f);
            }
            
            double[] n = new double[nm[0]];
            PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> -Double.compare(a[0], b[0]));
            pq.add(new double[] {1.0, 0});
            while(n[nm[0] - 1] == 0) {
                double[] c = pq.poll();
                int d = (int)c[1];
                if(n[d] > 0)
                    continue;
                n[d] = c[0];
                for(int i = 0; i < neighbors.get(d).size(); i++)
                    if(n[neighbors.get(d).get(i)] == 0)
                        pq.add(new double[] {n[d] * factors.get(d).get(i), neighbors.get(d).get(i)});
            }
            bw.write(String.format("%.4f\n", n[nm[0] - 1]));
        }
        bw.flush();
    }
}