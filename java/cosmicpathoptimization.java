import java.io.*;
import java.util.*;

public class cosmicpathoptimization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] T = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 1; i < T.length; i++)
            T[0] += T[i];
        System.out.println(T[0] / T.length);
    }
}