import java.io.*;
import java.util.*;

public class paperpilepandemonium {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NP = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> l = new ArrayList<>(NP[1]);
        while(NP[1]-- > 0) {
            List<Integer> lt = new ArrayList<>();
            int[] at = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int i = 1; i < at.length; i++)
                lt.add(at[i]);
            l.add(lt);
        }
        int M = Integer.parseInt(br.readLine());
        while(M-- > 0) {
            int[] sdn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            sdn[2] = l.get(sdn[0] - 1).size() - sdn[2];
            while(l.get(sdn[0] - 1).size() > sdn[2])
                l.get(sdn[1] - 1).add(l.get(sdn[0] - 1).remove(sdn[2]));
        }
        for(List<Integer> ls : l) {
            for(int i : ls)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}