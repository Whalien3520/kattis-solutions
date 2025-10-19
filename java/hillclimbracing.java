import java.io.*;
import java.util.*;

public class hillclimbracing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] la = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), h = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < la[0]; i++)
            if(h[i + 1] - h[i] > la[1]) {
                System.out.println("BUG REPORT");
                return;
            }
        System.out.println("POSSIBLE");
    }
}