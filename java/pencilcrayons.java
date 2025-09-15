import java.io.*;
import java.util.*;

public class pencilcrayons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        while(NK[0]-- > 0) {
            HashSet<String> s = new HashSet<>();
            String[] a = br.readLine().split(" ");
            for(String t : a) {
                if(s.contains(t))
                    ret++;
                else
                    s.add(t);
            }
        }
        System.out.println(ret);
    }
}