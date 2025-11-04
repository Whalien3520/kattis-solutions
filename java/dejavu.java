import java.io.*;
import java.math.*;
import java.util.*;

public class dejavu {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Map<Integer, Long> rows = new HashMap<>(), cols = new HashMap<>();
        List<int[]> coords = new ArrayList<>();
        while(N-- > 0) {
            int[] cur = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            coords.add(cur);
            rows.put(cur[0], rows.getOrDefault(cur[0], 0l) + 1);
            cols.put(cur[1], cols.getOrDefault(cur[1], 0l) + 1);
        }
        long ret = 0;
        for(int[] coord : coords) {
            Long nr = rows.get(coord[0]), nc = cols.get(coord[1]);
            ret += (nr - 1) * (nc - 1);
        }
        bw.write(String.format("%d\n", ret));
        bw.flush();
    }
}