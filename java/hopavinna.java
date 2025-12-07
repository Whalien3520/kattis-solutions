import java.io.*;
import java.math.*;
import java.util.*;

public class hopavinna {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), dpy = new int[n + 1], dpn = new int[n + 1];
        for(int i = 0; i < n; i++) {
            dpy[i + 1] = dpn[i];
            dpn[i + 1] = Math.min(dpy[i], dpn[i]) + a[i];
        }
        System.out.println(Math.min(dpy[n], dpn[n]));
    }
}