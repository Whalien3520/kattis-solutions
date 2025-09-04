import java.io.*;
import java.util.*;

public class relocation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NQ = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] loc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        while(NQ[1]-- > 0) {
            int[] r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(r[0] == 1)
                loc[r[1] - 1] = r[2];
            else
                System.out.println(Math.abs(loc[r[1] - 1] - loc[r[2] - 1]));
        }
    }
}