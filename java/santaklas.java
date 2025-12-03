import java.io.*;
import java.math.*;
import java.util.*;

public class santaklas {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] Hv = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(Hv[1] <= 180) {
            System.out.println("safe");
            return;
        }
        System.out.println((int)Math.abs(Hv[0] / Math.sin(Math.toRadians(Hv[1]))));
    }
}