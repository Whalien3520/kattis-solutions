import java.io.*;
import java.math.*;
import java.util.*;

public class languagecount {
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
        int l = nextInt();
        Map<String, Integer> m = new TreeMap<>();
        while(l-- > 0) {
            next();
            next();
            String d = next();
            if(d.charAt(d.length() - 1) == ')')
                d = d.substring(0, d.length() - 3);
            m.put(d, m.getOrDefault(d, 0) + 1);
        }
        for(String s : m.keySet())
            sb.append(s + " " + m.get(s) + "\n");
        System.out.print(sb);
    }
}