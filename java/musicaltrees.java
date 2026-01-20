import java.io.*;
import java.math.*;
import java.util.*;

public class musicaltrees {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), p = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(t);
        Set<Integer> s = new HashSet<>();
        int ret = 0;
        for(int i : p) {
            int n = Arrays.binarySearch(t, i);
            if(n < 0) {
                n = -(n + 1);
                if(n == t.length || (n != 0 && ((i - t[n - 1]) <= (t[n] - i))))
                    n--;
            }
            if(s.contains(n))
                ret++;
            else
                s.add(n);
        }
        System.out.println(ret);
    }
}