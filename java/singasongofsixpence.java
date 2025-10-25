import java.io.*;
import java.math.*;
import java.util.*;

public class singasongofsixpence {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        double R = Double.parseDouble(br.readLine()), r = Double.parseDouble(br.readLine()), h = Double.parseDouble(br.readLine()), v = Double.parseDouble(br.readLine());
        System.out.println((int)(3.14159 * h * (R * R + R * r + r * r) / 3 / v) + " birds");
    }
}