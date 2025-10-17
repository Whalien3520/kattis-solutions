import java.io.*;
import java.util.*;

public class fairgrading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] xyz = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double d = xyz[0] * 0.25 + xyz[1] * 0.25 + xyz[2] * 0.5;
        System.out.println(d >= 90 ? "A" : d >= 80 ? "B" : d >= 70 ? "C" : d >= 60 ? "D" : "F");
    }
}