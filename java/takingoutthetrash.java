import java.io.*;
import java.math.*;
import java.util.*;

public class takingoutthetrash {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), w = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(w);
        int l = 0, ret = 0;
        for(int r = nm[0] - 1; r >= l; r--) {
            if(w[r] + w[l] <= nm[1])
                l++;
            ret++;
        }
        System.out.println(ret);
    }
}