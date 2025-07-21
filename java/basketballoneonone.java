import java.io.*;
import java.util.*;

public class basketballoneonone {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        int a = 0, b = 0;
        for(int i = 0; i < s.length; i += 2) {
            if(s[i] == 'A')
                a += s[i + 1];
            else
                b += s[i + 1];
        }
        System.out.println(a > b ? "A" : "B");
    }
}