import java.io.*;
import java.util.*;

public class chanukah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());
        while(P-- > 0) {
            int[] KN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            KN[1]++;
            System.out.println(KN[0] + " " + ((KN[1] * (KN[1] + 1)) / 2 - 1));
        }
    }
}