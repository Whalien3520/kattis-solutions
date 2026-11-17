import java.io.*;
import java.math.*;
import java.util.*;

public class gettingtobed {
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
        int n = nextInt(), m = nextInt(), k = nextInt();
        int[][] r = new int[n][m], moves = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while(k-- > 0)
            r[nextInt()][nextInt()] = -1;
        int f = nextInt(), g = nextInt();
        boolean flag = true;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        s.push(0);
        r[0][0] = 1;
        while(!s.isEmpty()) {
            int y = s.pop(), x = s.pop();
            if(x == f && y == g) {
                flag = false;
                break;
            }
            for(int[] move : moves) {
                int xx = x + move[0], yy = y + move[1];
                if(0 <= xx && xx < n && 0 <= yy && yy < m && r[xx][yy] == 0) {
                    r[xx][yy] = 1;
                    s.push(xx);
                    s.push(yy);
                }
            }
        }
        sb.append(flag ? "IMPOSSIBLE" : "SLEEPING");
        System.out.print(sb);
    }
}