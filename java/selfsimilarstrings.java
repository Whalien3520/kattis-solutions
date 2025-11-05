import java.io.*;
import java.math.*;
import java.util.*;

public class selfsimilarstrings {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        int i = 1;
        while((s = br.readLine()) != null) {
            int l = 0, h = s.length();
            while(l < h) {
                Set<String> sim = new HashSet<>(), uni = new HashSet<>();
                int m = (l + h) / 2;
                for(int j = 0; j + m <= s.length(); j++) {
                    String sub = s.substring(j, j + m);
                    if(sim.contains(sub))
                        continue;
                    if(!uni.contains(sub))
                        uni.add(sub);
                    else {
                        uni.remove(sub);
                        sim.add(sub);
                    }
                }
                if(uni.size() > 0)
                    h = m;
                else
                    l = m + 1;
            }
            bw.write(String.format("%d\n", l - 1));
        }
        bw.flush();
    }
}