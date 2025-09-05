import java.io.*;
import java.util.*;

public class helpaphd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            String s = br.readLine();
            if(s.equals("P=NP")) {
                System.out.println("skipped");
                continue;
            }
            int[] a = Arrays.stream(s.split("\\+")).mapToInt(Integer::parseInt).toArray();
            System.out.println(a[0] + a[1]);
        }
    }
}