import java.io.*;
import java.math.*;
import java.util.*;

public class networking {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Map<String, List<Integer>> m = new HashMap<>();
        while(NK[0]-- > 0) {
            String[] t = br.readLine().split(" ");
            m.computeIfAbsent(t[1], k -> new ArrayList<>()).add(Integer.parseInt(t[0]));
        }
        boolean[] dp = new boolean[NK[1] + 1];
        dp[0] = true;
        for(List<Integer> l : m.values())
            for(int i = NK[1] - 1; i >= 0; i--) {
                if(!dp[i])
                    continue;
                for(int c : l)
                    if(i + c <= NK[1])
                        dp[i + c] = true;
            }
        int ret = NK[1];
        while(!dp[ret])
            ret--;
        bw.write(ret + "\n");
        bw.flush();
    }
}