import java.io.*;
import java.util.*;

public class starguardians {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] a = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray(), s = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        Arrays.sort(s);
        double ret = s[n - 1] + a[0];
        for(int i = 1; i < n; i++) {
            s[n - i - 1] += s[n - i];
            ret = Math.max(ret, (double)(s[n - i - 1] + a[i]) / (i + 1));
        }
        System.out.println(ret);
    }
}