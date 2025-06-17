import java.io.*;
import java.util.*;

public class maeting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] n = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), m = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        HashSet<Integer> s = new HashSet<>();
        for(int i : m)
            s.add(i);
        for(int i : n)
            if(s.contains(i))
                System.out.print(i + " ");
    }
}