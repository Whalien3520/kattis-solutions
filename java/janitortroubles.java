import java.io.*;
import java.util.*;

public class janitortroubles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] a = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        double s = (a[0] + a[1] + a[2] + a[3]) / 2;
        System.out.println(Math.sqrt((s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3])));
    }
}