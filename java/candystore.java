import java.io.*;
import java.util.*;

public class candystore {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NQ = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashMap<String, String> m = new HashMap<>();
        while(NQ[0]-- > 0) {
            String s = br.readLine();
            String[] a = s.split(" ");
            String i = a[0].charAt(0) + "" + a[1].charAt(0);
            if(m.containsKey(i))
                m.put(i, "ambiguous");
            else
                m.put(i, s);
        }
        while(NQ[1]-- > 0)
            System.out.println(m.getOrDefault(br.readLine(), "nobody"));
    }
}