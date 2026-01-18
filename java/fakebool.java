import java.io.*;
import java.math.*;
import java.util.*;

public class fakebool {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] root = new int[nq[0]];
        for(int i = 1; i < nq[0]; i++)
            root[i] = i;
        while(nq[1]-- > 0) {
            String[] q = br.readLine().split(" ");
            int a = root(Integer.parseInt(q[1]), root);
            if(q[0].charAt(0) == 'L') {
                System.out.println(a);
                continue;
            }
            int b = root(Integer.parseInt(q[2]), root);
            if(a < b)
                root[b] = a;
            else if(b < a)
                root[a] = b;
        }
    }
    private static int root (int x, int[] root) {
        while(x != root[x]) {
            root[x] = root[root[x]];
            x = root[x];
        }
        return x;
    }
}