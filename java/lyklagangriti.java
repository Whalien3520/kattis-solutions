import java.io.*;
import java.math.*;
import java.util.*;

public class lyklagangriti {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        char[] a = br.readLine().toCharArray();
        int n = 0;
        LinkedList<Character> ll = new LinkedList<>();
        for(int i = 0; i < a.length; i++)
            switch(a[i]) {
                case 'L':
                    n--;
                    break;
                case 'B':
                    ll.remove(n-- - 1);
                    break;
                default:
                    if(a[i] != 'R')
                        ll.add(n, a[i]);
                    n++;
            }
        StringBuilder sb = new StringBuilder();
        for(char c : ll)
            sb.append(c);
        System.out.print(sb);
    }
}