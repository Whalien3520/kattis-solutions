import java.io.*;
import java.util.*;
public class pobudget {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), s = 0;
        while(N-- > 0) {
            br.readLine();
            s += Integer.parseInt(br.readLine());
        }
        System.out.println((s == 0) ? "Lagom" : ((s > 0) ? "Usch, vinst" : "Nekad"));
    }
}