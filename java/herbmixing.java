import java.io.*;
import java.math.*;
import java.util.*;

public class herbmixing {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] gr = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(gr[1] >= gr[0])
            System.out.println(10 * gr[0]);
        else {
            int ret = 10 * gr[1];
            gr[0] -= gr[1];
            ret += 10 * (gr[0] / 3);
            gr[0] %= 3;
            System.out.println(ret + ((gr[0] == 0) ? 0 : ((gr[0] == 1) ? 1 : 3)));
        }
    }
}