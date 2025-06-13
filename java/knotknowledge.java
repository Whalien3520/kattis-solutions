import java.io.*;
import java.util.*;

public class knotknowledge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] x = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), y = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean[] b = new boolean[1001];
        for(int i : y)
            b[i] = true;
        for(int i : x)
            if(!b[i]) {
                System.out.println(i);
                return;
            }
    }
}