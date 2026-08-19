// problem link: https://open.kattis.com/problems/absolutbio

import java.io.*;
import java.math.*;
import java.util.*;

public class absolutbio {
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
        int N = nextInt(), Q = nextInt();
        BitSet bs = new BitSet(N + 1);
        while(Q-- > 0) {
            int t = nextInt(), i = nextInt();
            if(t == 1) {
                if(bs.get(i))
                    sb.append("Upptagen\n");
                else {
                    sb.append("Ledig\n");
                    bs.set(i);
                }
            }
            else {
                int j = nextInt();
                if(bs.get(j))
                    sb.append("Upptagen\n");
                else {
                    sb.append("Ledig\n");
                    bs.set(j);
                    bs.set(i, false);
                }
            }
        }
        System.out.print(sb);
    }
}
