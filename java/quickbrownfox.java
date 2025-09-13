import java.io.*;
import java.util.*;

public class quickbrownfox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-- > 0) {
            char[] r = br.readLine().toLowerCase().toCharArray();
            boolean[] a = new boolean[26];
            for(char c : r)
                if(Character.isLetter(c))
                    a[c - 'a'] = true;
            boolean b = true;
            for(int i = 0; b && i < 26; i++)
                b = a[i];
            if(b) {
                System.out.println("pangram");
                continue;
            }
            System.out.print("missing ");
            for(int i = 0; i < 26; i++)
                if(!a[i])
                    System.out.print((char)('a' + i));
            System.out.println();
        }
    }
}