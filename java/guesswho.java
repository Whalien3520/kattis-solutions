import java.io.*;
import java.util.*;

public class guesswho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NMQ = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] a = new char[NMQ[0]][NMQ[1]];
        for(int i = 0; i < NMQ[0]; i++)
            a[i] = br.readLine().toCharArray();
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < a.length; i++)
            s.add(i);
        while(NMQ[2]-- > 0) {
            String[] p = br.readLine().split(" ");
            int i = Integer.parseInt(p[0]);
            s.removeIf(c -> a[c][i - 1] != p[1].charAt(0));
        }
        System.out.println(s.size() == 1 ? "unique" : "ambiguous");
        System.out.println(s.size() == 1 ? s.iterator().next() + 1 : s.size());
    }
}