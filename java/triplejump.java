import java.io.*;
import java.util.*;

public class triplejump {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        br.readLine();
        int[] r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = r[0] / 3, b = r[1] - 2 * a, c = r[r.length - 1] / 3;
        System.out.println(a + " " + b + " " + c);
    }
}