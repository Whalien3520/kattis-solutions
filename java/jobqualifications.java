import java.io.*;
import java.math.*;
import java.util.*;

public class jobqualifications {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Set<String> set = new HashSet<>();
        while(nm[0]-- > 0)
            set.add(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(nm[1]-- > 0) {
            int k = Integer.parseInt(br.readLine());
            boolean flag = true;
            while(k-- > 0)
                flag &= set.contains(br.readLine());
            sb.append(flag ? "apply\n" : "why bother?\n");
        }
        System.out.println(sb);
    }
}