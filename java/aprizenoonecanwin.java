import java.io.*;
import java.math.*;
import java.util.*;

public class aprizenoonecanwin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nX = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(nX[0] == 1) {
            System.out.println(1);
            return;
        }
        Arrays.sort(n);
        int p = n[0];
        for(int i = 1; i < nX[0]; i++) {
            int s = p + n[i];
            if(s > nX[1]) {
                System.out.println(i);
                return;
            }
            p = n[i];
        }
        System.out.println(nX[0]);
    }
}