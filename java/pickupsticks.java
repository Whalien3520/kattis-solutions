import java.io.*;
import java.math.*;
import java.util.*;

public class pickupsticks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    private static String next() {
        while(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    private static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuffer sb = new StringBuffer();
        int n = nextInt(), m = nextInt();
        int[] o = new int[n + 1];
        Map<Integer, List<Integer>> u = new HashMap<>();
        for(int i = 0; i < m; i++) {
            int a = nextInt(), b = nextInt();
            o[b]++;
            if(!u.containsKey(a))
                u.put(a, new ArrayList<>());
            u.get(a).add(b);
        }
        
        List<Integer> r = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 1; i <= n; i++)
            if(o[i] == 0) {
                r.add(i);
                q.add(i);
            }
        while(!q.isEmpty()) {
            int c = q.poll();
            if(u.containsKey(c))
                for(int i : u.get(c)) {
                    o[i]--;
                    if(o[i] == 0) {
                        r.add(i);
                        q.add(i);
                    }
                }
        }
        if(r.size() < n)
            sb.append("IMPOSSIBLE\n");
        else
            for(int i : r)
                sb.append(i + "\n");
        System.out.print(sb);
    }
}