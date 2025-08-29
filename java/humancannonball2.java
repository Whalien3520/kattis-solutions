import java.io.*;
import java.util.*;

public class humancannonball2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            double[] params = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double rad = params[1] * Math.PI / 180, cos = Math.cos(rad), t = params[2] / cos / params[0], y = params[0] * t * Math.sin(rad) - 9.81 * t * t / 2;
            System.out.println((params[4] - y >= 1 && y - params[3] >= 1) ? "Safe" : "Not safe");
        }
    }
}