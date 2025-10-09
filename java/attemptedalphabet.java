import java.io.*;
import java.util.*;

public class attemptedalphabet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();
        boolean[] a = new boolean[26];
        for(char c : s)
            a[c - 'a'] = true;
        boolean ret = true;
        for(int i = 0; i < a.length; i++)
            if(!a[i]) {
                System.out.print((char)('a' + i));
                ret = false;
            }
        if(ret)
            System.out.println("Good job!");
    }
}