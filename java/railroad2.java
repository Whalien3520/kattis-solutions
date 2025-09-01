import java.io.*;
import java.util.*;

public class railroad2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] XY = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(XY[1] % 2 == 0 ? "possible" : "impossible");
    }
}