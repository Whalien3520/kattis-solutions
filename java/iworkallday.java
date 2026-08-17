import java.io.*;
import java.math.*;
import java.util.*;

public class iworkallday {
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
        int N = nextInt();
        List<Integer> H = new ArrayList<>();
        while(N-- > 0)
            H.add(nextInt());
        int T = nextInt();
        int ret = -1, r = Integer.MAX_VALUE;
        for(int i : H)
            if(T % i < r) {
                r = T % i;
                ret = i;
            }
        sb.append(ret);
        System.out.print(sb);
    }
}