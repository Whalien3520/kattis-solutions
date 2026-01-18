import java.io.*;
import java.math.*;
import java.util.*;

public class longestcollatz {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<Long, Integer> m = new HashMap<>();
        long ret = 0l;
        int n = Integer.parseInt(br.readLine()), retm = -1;
        for(long i = 1; i < n; i++) {
            int s = 0;
            long j = i;
            while(j != 1) {
                if(m.containsKey(j)) {
                    s += m.get(j);
                    break;
                }
                if(j % 2 == 0)
                    j >>= 1;
                else
                    j = 3 * j + 1;
                s++;
            }
            m.put(i, s);
            if(s > retm) {
                ret = i;
                retm = s;
            }
        }
        System.out.println(ret);
    }
}