import java.io.*;
import java.math.*;
import java.util.*;

public class gettowork {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int C = Integer.parseInt(br.readLine());
        for(int c = 1; c <= C; c++) {
            int[] NT = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), n = new int[NT[0]];
            List<List<Integer>> p = new ArrayList<>(NT[0]);
            for(int i = 0; i < NT[0]; i++)
                p.add(new ArrayList<>());
            int E = Integer.parseInt(br.readLine());
            while(E-- > 0) {
                int[] e = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                p.get(e[0] - 1).add(e[1]); 
            }
            
            boolean ret = true;
            for(int i = 0; i < NT[0] && ret; i++) {
                if(i == NT[1] - 1)
                    continue;
                Collections.sort(p.get(i), (a, b) -> -Integer.compare(a, b));
                int s = 0;
                for(int j = 0; j < p.get(i).size(); j++) {
                    s += p.get(i).get(j);
                    if(s >= p.get(i).size()) {
                        n[i] = j + 1;
                        break;
                    }
                }
                ret = s >= p.get(i).size();
            }
            bw.write(String.format("Case #%d: ", c));
            if(!ret) {
                bw.write("IMPOSSIBLE\n");
                continue;
            }
            for(int i : n)
                bw.write(i + " ");
            bw.newLine();
        }
        bw.flush();
    }
}