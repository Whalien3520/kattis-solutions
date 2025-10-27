import java.io.*;
import java.math.*;
import java.util.*;

public class kastenlauf {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            int n = Integer.parseInt(br.readLine()), added = 1;
            int[][] l = new int[n + 2][2];
            for(int i = 0; i < n + 2; i++)
                l[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean[] v = new boolean[n + 2];
            v[0] = true;
            while(added > 0 && !v[n + 1]) {
                added = 0;
                for(int i = 1; i < n + 2; i++) {
                    if(v[i])
                        continue;
                    for(int j = 0; j < n + 2; j++)
                        if(v[j] && Math.abs(l[j][0] - l[i][0]) + Math.abs(l[j][1] - l[i][1]) <= 1000) {
                            v[i] = true;
                            added++;
                        }
                }
            }
			bw.write(String.format("%s\n", v[n + 1] ? "happy" : "sad"));
        }
		bw.flush();
    }
}