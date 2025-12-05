import java.io.*;
import java.math.*;
import java.util.*;

public class repetitivesong {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
        Map<String, Integer> recent = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if(recent.containsKey(s))
                min = Math.min(min, i - recent.get(s));
            recent.put(s, i);
        }
        System.out.println(min > n ? 0 : n - min);
    }
}