import java.io.*;
import java.math.*;
import java.util.*;

public class bankclosing {
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
        int n = nextInt(), k = nextInt();
        int[] t = new int[k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(t[a], t[b]));
        for(int i = 1; i <= k; i++) {
            t[i] = nextInt();
            pq.add(i);
        }
        while(!pq.isEmpty()) {
            int c = pq.poll();
            System.out.println(c);
            String s = next();
            if(s.equals("DONE"))
                continue;
            t[c] = Integer.parseInt(s);
            pq.add(c);
        }
        System.out.println("DONE");
    }
}