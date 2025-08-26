import java.io.*;
import java.util.*;

public class qwerty {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char[] r = br.readLine().toCharArray();
        String q = "qwertyuiopasdfghjklzxcvbnm ", a = "abcdefghijklmnopqrstuvwxyz ";
        for(char c : r)
            System.out.print(q.charAt(a.indexOf(c)));
    }
}