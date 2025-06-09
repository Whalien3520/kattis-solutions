import java.io.*;
import java.util.*;

public class faktor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] AI = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(AI[0] * (AI[1] - 1) + 1);
    }
}