import java.io.*;
import java.util.*;

public class midjan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), m = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<Integer> sn = new HashSet<>(), sm = new HashSet<>();
        for(int i : n)
            sn.add(i);
        for(int i : m)
            sm.add(i);
        for(int i : n)
            if(!sm.contains(i))
                System.out.print(i + " ");
        System.out.println();
        for(int i : m)
            if(!sn.contains(i))
                System.out.print(i + " ");
    }
}