import java.io.*;
import java.util.*;

public class gnomesequencing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println("Gnomes:");
        while(N-- > 0) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println((a[0] < a[1] && a[1] < a[2]) || (a[0] > a[1] && a[1] > a[2]) ? "Ordered" : "Unordered");
        }
    }
}