import java.io.*;
import java.math.*;
import java.util.*;
public class poweringteslopolis {
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
        int N = nextInt(), M = nextInt();
        int[] m = new int[N];
        int[][] moves = new int[][] {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 0}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        for(int i = 0; i < N; i++) {
            char[] t = next().toCharArray();
            for(int j = 0; j < M; j++)
                if(t[j] == 'T')
                    for(int[] move : moves) {
                        int r = i + move[0], c = j + move[1];
                        if(0 <= r && r < N && 0 <= c && c < M)
                            m[r] |= 1 << c;
                    }
        }
        
        List<Integer> r = new ArrayList<>();
        for(int i = 0; i < N; i++)
            for(int j = 0; j < M; j++)
                if((m[i] & (1 << j)) == 0) {
                    r.add(i);
                    r.add(j);
                }
        
        sb.append(r.isEmpty() ? "True\n" : "False\n");
        for(int i = 0; i < r.size(); i += 2)
            sb.append(String.format("%d %d\n", r.get(i), r.get(i + 1)));
        System.out.print(sb);
    }
}