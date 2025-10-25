import java.io.*;
import java.math.*;
import java.util.*;

public class foragainstoronthefence {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        long[] p = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray(), v = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        long u = Long.parseLong(br.readLine()), dx = v[0] - p[0], dy = v[1] - p[1], d = dx * dx + dy * dy;
        System.out.println(d < u ? "for" : d == u ? "on the fence" : "against");
    }
}