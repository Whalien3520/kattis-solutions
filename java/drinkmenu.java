import java.io.*;
import java.util.*;

public class drinkmenu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<String> l = new ArrayList<>(nm[0]);
        while(nm[0]-- > 0)
            l.add(br.readLine());
        Map<String, Integer> m = new HashMap<>();
        while(nm[1]-- > 0) {
            String s = br.readLine();
            int i = m.getOrDefault(s, 0);
            System.out.println(l.get(i));
            m.put(s, i + 1);
        }
    }
}