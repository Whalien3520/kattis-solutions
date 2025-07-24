import java.io.*;
import java.util.*;

public class gcvwr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] GTN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int s = 0;
        for(int n : N)
            s += n;
        System.out.println((GTN[0] - GTN[1]) * 9 / 10 - s);
    }
}