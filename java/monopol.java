import java.io.*;
import java.util.*;

public class monopol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double d = 0.0;
        for(int i : A)
            d += (6.0 - (Math.abs(7 - i))) / 36.0;
        System.out.println(d);
    }
}