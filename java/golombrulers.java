import java.io.*;
import java.math.*;
import java.util.*;

public class golombrulers {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        int c = 1;
        while((s = br.readLine()) != null) {
            int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            Set<Integer> set = new HashSet<>();
            boolean ruler = true;
            int max = a[a.length - 1];
            for(int i = 0; i + 1 < a.length && ruler; i++) {
                max = Math.max(a[i], max);
                for(int j = i + 1; j < a.length && ruler; j++) {
                    int m = Math.abs(a[j] - a[i]);
                    ruler = !set.contains(m);
                    set.add(m);
                }
            }
            if(!ruler) {
                bw.write("not a ruler\n");
                continue;
            }
            if(set.size() == max) {
                bw.write("perfect\n");
                continue;
            }
            bw.write("missing ");
            for(int i = 1; i <= max; i++)
                if(!set.contains(i))
                    bw.write(i + " ");
            bw.newLine();
        }
        bw.flush();
    }
}