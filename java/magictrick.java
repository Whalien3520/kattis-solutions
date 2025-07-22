import java.io.*;
import java.util.*;

public class magictrick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        HashSet<Character> s = new HashSet<>();
        boolean flag = true;
        for(char c : a) {
            if(s.contains(c)) {
                flag = false;
                break;
            }
            s.add(c);
        }
        System.out.println(flag ? 1 : 0);
    }
}