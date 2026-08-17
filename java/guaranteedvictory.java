import java.io.*;
import java.math.*;
import java.util.*;

public class guaranteedvictory {
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
        int N = nextInt(), R = nextInt();
        Queue<String> r = new LinkedList<>();
        while(N-- > 0)
            r.add(next());
        Map<String, Integer> l = new HashMap<>();
        Map<String, List<String>> m = new HashMap<>();
        for(int i = 0; i < R; i++) {
            int Ri = nextInt();
            String p = next();
            l.put(p, Ri - 1);
            while(--Ri > 0) {
                String e = next();
                if(!m.containsKey(e))
                    m.put(e, new ArrayList<>());
                m.get(e).add(p);
            }
        }
        
        while(!r.isEmpty()) {
            String c = r.poll();
            for(String p : m.getOrDefault(c, new ArrayList<>())) {
                l.put(p, l.get(p) - 1);
                if(l.get(p) == 0) {
                    r.add(p);
                    R--;
                }
            }
        }
        
        sb.append(R == 0 ? "GUARANTEED VICTORY" : R);
        System.out.println(sb);
    }
}