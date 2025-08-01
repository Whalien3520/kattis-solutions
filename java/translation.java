import java.io.*;
import java.util.*;

public class translation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] a = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());
        HashMap<String, String> m = new HashMap<>();
        while(M-- > 0) {
            String[] t = br.readLine().split(" ");
            m.put(t[0], t[1]);
        }
        for(String s : a)
            System.out.print(m.get(s) + " ");
    }
}