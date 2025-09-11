import java.io.*;
import java.util.*;

public class squarepeg {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] LR = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.println(LR[0] * Math.sqrt(2) <= 2 * LR[1] ? "fits" : "nope");
    }
}