import java.io.*;
import java.util.*;

public class moderatepace {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] k = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), b = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < n; i++)
            System.out.print((k[i] < a[i] ? (a[i] < b[i] ? a[i] : (k[i] < b[i] ? b[i] : k[i])) : (k[i] < b[i] ? k[i] : (a[i] < b[i] ? b[i] : a[i]))) + " ");
    }
}