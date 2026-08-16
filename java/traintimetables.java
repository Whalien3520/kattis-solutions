import java.io.*;
import java.math.*;
import java.util.*;

public class traintimetables {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    static String next() {
        if(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int S = nextInt();
        for(int i = 1; i <= S; i++) {
            int T = nextInt(), NA = nextInt(), NB = nextInt(), ta = 0, tb = 0, ra = 0, rb = 0;
            PriorityQueue<Integer> qa = new PriorityQueue<>(), qb = new PriorityQueue<>();
            int[] a = new int[NA], b = new int[NB];
            while(NA-- > 0) {
                String[] d = next().split(":"), r = next().split(":");
                a[NA] = Integer.parseInt(d[0]) * 60 + Integer.parseInt(d[1]);
                qb.add(Integer.parseInt(r[0]) * 60 + Integer.parseInt(r[1]) + T);
            }
            while(NB-- > 0) {
                String[] d = next().split(":"), r = next().split(":");
                b[NB] = Integer.parseInt(d[0]) * 60 + Integer.parseInt(d[1]);
                qa.add(Integer.parseInt(r[0]) * 60 + Integer.parseInt(r[1]) + T);
            }
            Arrays.sort(a);
            Arrays.sort(b);
            for(int d : a) {
                while(!qa.isEmpty() && qa.peek() <= d) {
                    qa.poll();
                    ta++;
                }
                if(ta == 0)
                    ra++;
                else
                    ta--;
            }
            for(int d : b) {
                while(!qb.isEmpty() && qb.peek() <= d) {
                    qb.poll();
                    tb++;
                }
                if(tb == 0)
                    rb++;
                else
                    tb--;
            }
            
            sb.append(String.format("Case #%d: %d %d\n", i, ra, rb));
        }
        System.out.print(sb);
    }
}