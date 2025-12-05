import java.io.*;
import java.math.*;
import java.util.*;

public class inflation2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        long[] p = Arrays.stream(br.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
        Map<Long, Integer> m = new HashMap<>();
        int Q = Integer.parseInt(br.readLine());
        long ret = 0, off = 0;
        for(long l : p) {
            ret += l;
            m.put(l, m.getOrDefault(l, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        while(Q-- > 0) {
            String[] n = br.readLine().split(" ");
            long x = Long.parseLong(n[1]);
            if(n[0].charAt(0) == 'I') {
                off += x;
                ret += x * N;
            }
            else {
                long y = Long.parseLong(n[2]);
                ret += m.getOrDefault(x - off, 0) * ((y - off) - (x - off));
                int t = m.getOrDefault(x - off, 0);
                m.put(y - off, m.getOrDefault(y - off, 0) + t);
                m.put(x - off, m.getOrDefault(x - off, 0) - t);
            }
            sb.append(ret + "\n");
        }
        System.out.println(sb);
    }
}