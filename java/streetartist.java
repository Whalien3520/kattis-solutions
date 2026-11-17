import java.io.*;
import java.math.*;
import java.util.*;

public class streetartist {
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
        StringBuilder sb = new StringBuilder();
        int n = nextInt();
        List<String> l = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        while(n-- > 0) {
            String a = next();
            int h = nextInt();
            while(!s.isEmpty() && s.peek() <= h) {
                s.pop();
                l.remove(l.size() - 1);
            }
            s.push(h);
            l.add(a);
        }
        for(String a : l)
            sb.append(a + " ");
        System.out.print(sb);
    }
}