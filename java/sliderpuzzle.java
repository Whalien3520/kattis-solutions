import java.io.*;
import java.math.*;
import java.util.*;

public class sliderpuzzle {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        for(int i = 1; i <= t; i++) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean[] b = new boolean[a.length];
            LinkedList<Integer> q = new LinkedList<>();
            q.add(0);
            b[0] = true;
            while(!q.isEmpty()) {
                int c = q.poll();
                if(c == a.length - 1)
                    break;
                if(c + a[c] < a.length && !b[c + a[c]]) {
                    q.add(c + a[c]);
                    b[c + a[c]] = true;
                }
                if(c > a[c] && !b[c - a[c]]) {
                    q.add(c - a[c]);
                    b[c - a[c]] = true;
                }
            }
            System.out.println(String.format("Puzzle %d is%s solvable.", i, (b[b.length - 1] ? "" : " not")));
        }
    }
}