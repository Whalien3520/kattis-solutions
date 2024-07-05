import java.io.*;
import java.util.*;
public class ovalwatch {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        while(NK[1]-- > 0)
            pq.add(Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        
        int[] ret = new int[NK[0]];
        for(int i = 1; i < ret.length; i++)
            ret[i] = i;
        while(!pq.isEmpty()) {
            int[] p = pq.poll();
            int i = ret[p[0]];
            ret[p[0]] = ret[p[0] + 1];
            ret[p[0] + 1] = i;
        }
        for(int i : ret)
            System.out.print(i + " ");
    }
}