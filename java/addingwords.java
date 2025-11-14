import java.io.*;
import java.math.*;
import java.util.*;

public class addingwords {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Map<String, Integer> msi = new HashMap<>();
        Map<Integer, String> mis = new HashMap<>();
        String s;
        OUTERLOOP:
        while((s = br.readLine()) != null) {
            String[] a = s.split(" ");
            if(s.charAt(0) == 'd') {
                int i = Integer.parseInt(a[2]);
                if(msi.containsKey(a[1]))
                    mis.remove(msi.get(a[1]));
                msi.put(a[1], i);
                mis.put(i, a[1]);
            }
            else if(s.charAt(1) == 'l') {
                msi.clear();
                mis.clear();
            }
            else {
                int c = 0, m = 1;
                for(int i = 1; i < a.length; i++)
                    bw.write(a[i] + " ");
                for(int i = 1; i < a.length; i++) {
                    if(i % 2 == 1) {
                        if(!msi.containsKey(a[i])) {
                            bw.write("unknown\n");
                            continue OUTERLOOP;
                        }
                        c += m * msi.get(a[i]);
                    }
                    else
                        m = a[i].equals("-") ? -1 : 1;
                }
                bw.write(String.format("%s\n", mis.getOrDefault(c, "unknown")));
            }
        }
        bw.flush();
    }
}