import java.io.*;
import java.math.*;
import java.util.*;

public class gremlins {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<String> l = new ArrayList<>();
        while(nm[0]-- > 0)
            l.add(br.readLine());
        Map<String, Integer> m = new HashMap<>();
        int i = 1;
        while(nm[1]-- > 0)
            m.put(br.readLine(), i++);
        for(String s : l)
            System.out.println(m.containsKey(s) ? m.get(s) : "stolen!");
    }
}