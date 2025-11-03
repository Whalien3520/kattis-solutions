import java.io.*;
import java.math.*;
import java.util.*;

public class kaploeb {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] lks = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Integer> k = new HashMap<>();
        Map<Integer, Long> m = new HashMap<>();
        while(lks[0]-- > 0) {
            String[] s = br.readLine().split(" "), t = s[1].split("\\.");
            int i = Integer.parseInt(s[0]);
            k.put(i, k.getOrDefault(i, lks[1]) - 1);
            m.put(i, m.getOrDefault(i, 0l) + 60 * Long.parseLong(t[0]) + Long.parseLong(t[1]));
        }
        List<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : k.entrySet())
            if(e.getValue() == 0)
                l.add(e.getKey());
        Collections.sort(l, (a, b) -> Long.compare(m.get(a), m.get(b)) != 0 ? Long.compare(m.get(a), m.get(b)) : Integer.compare(a, b));
        for(int i : l)
            bw.write(i + "\n");
        bw.flush();
    }
}