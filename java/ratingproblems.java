import java.io.*;
import java.util.*;

public class ratingproblems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double s = 0;
        for(int i = 0; i < nk[1]; i++)
            s += Integer.parseInt(br.readLine());
        System.out.println(((s - 3 * (nk[0] - nk[1])) / nk[0]) + " " + ((s + 3 * (nk[0] - nk[1])) / nk[0]));
    }
}