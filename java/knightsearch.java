import java.io.*;
import java.math.*;
import java.util.*;

public class knightsearch {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray(), s = "ICPCASIASG".toCharArray();
        int[][] moves = new int[][] {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};
        for(int i = 0; i < S.length && sb.length() == 0; i++) {
            List<Integer> cur = new ArrayList<>();
            cur.add(i);
            for(int j = 0; j < s.length && !cur.isEmpty(); j++) {
                List<Integer> next = new ArrayList<>();
                for(int k : cur) {
                    if(S[k] != s[j])
                        continue;
                    for(int[] move : moves) {
                        int kk = k + move[0] * N + move[1];
                        if(0 <= kk && kk < S.length)
                            next.add(kk);
                    }
                }
                cur = next;
            }
            if(!cur.isEmpty())
                sb.append("YES");
        }
        System.out.println(sb.length() == 0 ? "NO" : sb.toString());
    }
}