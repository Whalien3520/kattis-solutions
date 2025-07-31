import java.io.*;
import java.util.*;

public class rectanglearea {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] a = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        System.out.println(Math.abs(a[0] - a[2]) * Math.abs(a[1] - a[3]));
    }
}