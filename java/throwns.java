import java.io.*;
import java.util.*;
public class throwns {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[] c = r.readLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < c.length; i++) {
            if(c[i].equals("undo")) {
                for(int j = Integer.parseInt(c[i + 1]); j > 0; j--)
                    s.pop();
            i++;
        }
            else
                s.push(Integer.parseInt(c[i]));
        }
        int ret = 0;
        while(!s.isEmpty())
            ret += s.pop();
        while(ret < 0)
            ret += nk[0];
        ret = ret % nk[0];
        System.out.println(ret);
    }
}