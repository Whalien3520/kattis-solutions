import java.io.*;
import java.util.*;

public class divvyingup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int s = 0;
        for(int n : a)
            s += n;
        System.out.println(s % 3 == 0 ? "yes" : "no");
    }
}