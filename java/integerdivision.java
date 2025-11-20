import java.io.*;
import java.math.*;
import java.util.*;

public class integerdivision {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int[] nd = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<Integer, Long> m = new HashMap<>();
        for(int i : a)
            m.put(i / nd[1], m.getOrDefault(i / nd[1], 0l) + 1);
        long ret = 0;
        for(Map.Entry<Integer, Long> e : m.entrySet())
            ret += e.getValue() * (e.getValue() - 1) / 2;
        sb.append(ret);
        System.out.println(sb);
    }
}