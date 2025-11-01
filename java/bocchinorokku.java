import java.io.*;
import java.math.*;
import java.util.*;

public class bocchinorokku {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[] w = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), c = Arrays.copyOf(w, w.length);
        Map<Integer, Integer> m = new HashMap<>();
        Arrays.sort(c);
        for(int i = 0; i < c.length; i++)
            m.put(c[i], i);
        for(int i : w)
            bw.write(m.get(i) + " ");
        bw.newLine();
        bw.flush();
    }
}