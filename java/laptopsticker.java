import java.io.*;
import java.util.*;

public class laptopsticker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((a[0] - 1 > a[2] && a[1] - 1 > a[3]) ? 1 : 0);
    }
}