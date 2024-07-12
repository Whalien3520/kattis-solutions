import java.io.*;
import java.util.*;
public class dominoes2 {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(r.readLine());
        while(t-- > 0) {
            int[] nml = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            for(int i = 0; i <= nml[0]; i++)
                list.add(new ArrayList<>());
            while(nml[1]-- > 0) {
                int[] xy = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
                list.get(xy[0]).add(xy[1]);
            }
            boolean[] vis = new boolean[nml[0] + 1];
            int ret = 0;
            while(nml[2]-- > 0) {
                int z = Integer.parseInt(r.readLine());
                LinkedList<Integer> q = new LinkedList<>();
                q.add(z);
                while(!q.isEmpty()) {
                    int p = q.poll();
                    if(vis[p])
                        continue;
                    vis[p] = true;
                    ret++;
                    for(int n : list.get(p))
                        q.add(n);
                }
            }
            System.out.println(ret);
        }
    }
}