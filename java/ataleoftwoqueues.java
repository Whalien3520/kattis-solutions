import java.io.*;
import java.util.*;

public class ataleoftwoqueues {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] l = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ll = 0, rr = 0;
        for(int i : l)
            ll += i;
        for(int i : r)
            rr += i;
        System.out.println(ll == rr ? "either" : ll < rr ? "left" : "right");
    }
}