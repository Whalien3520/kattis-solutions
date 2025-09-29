import java.io.*;
import java.util.*;

public class numberfun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            int[] abc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(
                (abc[0] + abc[1] == abc[2]) ||
                (abc[0] - abc[1] == abc[2]) ||
                (abc[1] - abc[0] == abc[2]) ||
                (abc[0] * abc[1] == abc[2]) ||
                ((abc[0] / abc[1] == abc[2]) && (abc[0] % abc[1] == 0)) ||
                ((abc[1] / abc[0] == abc[2]) && (abc[1] % abc[0] == 0))
                ? "Possible" : "Impossible");
        }
    }
}