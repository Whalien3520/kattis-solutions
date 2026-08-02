import java.io.*;
import java.math.*;
import java.util.*;

public class dungeon {
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
        int L = nextInt(), R, C;
        while(L != 0) {
            R = nextInt();
            C = nextInt();
            
            char[][][] d = new char[L][R][C];
            int[][][] t = new int[L][R][C];
            int sl = -1, sr = -1, sc = -1, el = -1, er = -1, ec = -1;
            for(int l = 0; l < L; l++)
                for(int r = 0; r < R; r++) {
                    d[l][r] = next().toCharArray();
                    for(int c = 0; (sl == -1 || el == -1) && c < C; c++) {
                        if(d[l][r][c] == 'S') {
                            sl = l;
                            sr = r;
                            sc = c;
                        }
                        else if(d[l][r][c] == 'E') {
                            el = l;
                            er = r;
                            ec = c;
                        }
                    }
                }
                
            for(int[][] l : t)
                for(int i = 0; i < R; i++)
                    Arrays.fill(l[i], -1);
            Queue<Integer> q = new LinkedList<>();
            q.add(sl);
            q.add(sr);
            q.add(sc);
            t[sl][sr][sc] = 0;
            
            int[][] moves = new int[][] {{-1, 0, 0}, {1, 0, 0}, {0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}};
            while(!q.isEmpty() && t[el][er][ec] == -1) {
                int l = q.poll(), r = q.poll(), c = q.poll();
                for(int[] move : moves) {
                    int ll = l + move[0], rr = r + move[1], cc = c + move[2];
                    if(0 <= ll && ll < L && 0 <= rr && rr < R && 0 <= cc && cc < C && d[ll][rr][cc] != '#' && t[ll][rr][cc] == -1) {
                        q.add(ll);
                        q.add(rr);
                        q.add(cc);
                        t[ll][rr][cc] = t[l][r][c] + 1;
                    }
                }
            }
            
            sb.append(t[el][er][ec] == -1 ? "Trapped!\n" : String.format("Escaped in %d minute(s).\n", t[el][er][ec]));
            
            
            L = nextInt();
        }
        System.out.print(sb);
    }
}