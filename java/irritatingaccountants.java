import java.io.*;
import java.math.*;
import java.util.*;
public class irritatingaccountants {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    private static String next() {
        if(!st.hasMoreTokens()) {
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
        StringBuilder sb = new StringBuilder();
        int n = nextInt(), k = nextInt();
        Map<String, Integer> t = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String s = next();
            t.put(s, t.getOrDefault(s, 0) + 1);
        }
        
        String[] c = new String[k];
        for(int i = 0; i < k; i++)
            c[i] = next();
            
        Map<String, String> a = new HashMap<>();
        for(int i = 0; i < k; i++) {
            String s = next();
            int m = nextInt();
            for(int j = 0; j < m; j++) {
                String tt = next();
                for(int l = 0; l < t.getOrDefault(tt, 0); l++)
                    sb.append(tt + " ");
            }
            a.put(s, sb.toString());
            sb = new StringBuilder();
        }
        
        for(String s : c)
            sb.append(a.get(s));
        System.out.print(sb);
    }
}