import java.io.*;
import java.util.*;

public class t9spelling {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Character, String> m = Map.ofEntries(
            Map.entry('a', "2"),
            Map.entry('b', "22"),
            Map.entry('c', "222"),
            Map.entry('d', "3"),
            Map.entry('e', "33"),
            Map.entry('f', "333"),
            Map.entry('g', "4"),
            Map.entry('h', "44"),
            Map.entry('i', "444"),
            Map.entry('j', "5"),
            Map.entry('k', "55"),
            Map.entry('l', "555"),
            Map.entry('m', "6"),
            Map.entry('n', "66"),
            Map.entry('o', "666"),
            Map.entry('p', "7"),
            Map.entry('q', "77"),
            Map.entry('r', "777"),
            Map.entry('s', "7777"),
            Map.entry('t', "8"),
            Map.entry('u', "88"),
            Map.entry('v', "888"),
            Map.entry('w', "9"),
            Map.entry('x', "99"),
            Map.entry('y', "999"),
            Map.entry('z', "9999"),
            Map.entry(' ', "0")
            );
        for(int i = 1; i <= N; i++) {
            System.out.print("Case #" + i + ": ");
            char[] a = br.readLine().toCharArray();
            char p = 0;
            for(char c : a) {
                String s = m.get(c);
                if(s.charAt(0) == p)
                    System.out.print(' ');
                System.out.print(s);
                p = s.charAt(0);
            }
            System.out.println();
        }
    }
}