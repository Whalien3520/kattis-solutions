import java.io.*;
import java.math.*;
import java.util.*;

public class birthdaycandles {
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
        int N = nextInt(), H = nextInt(), C = nextInt(), ret = 0;
        int[][] a = new int[N][H];
        for(int r = 0; r < N; r++) {
            for(int c = 0; c < H; c++)
                a[r][c] = nextInt();
            Arrays.sort(a[r]);
        }
        boolean flag = true;
        for(int i = 0; flag && i < H; i++) {
            int[] c = new int[N];
            for(int j = 0; j < N; j++)
                c[j] = a[j][i];
            Arrays.sort(c);
            for(int j = 0; flag && j < N; j++) {
                if(C >= c[j]) {
                    ret++;
                    C -= c[j];
                    continue;
                }
                flag = false;
            }
        }
        sb.append(ret);
        System.out.print(sb);
    }
}