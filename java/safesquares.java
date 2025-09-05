import java.io.*;
import java.util.*;

public class safesquares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BitSet r = new BitSet(), c = new BitSet();
        for(int i = 0; i < 8; i++) {
            char[] s = br.readLine().toCharArray();
            for(int j = 0; j < 8; j++)
                if(s[j] == 'R') {
                    r.set(i);
                    c.set(j);
                }
        }
        System.out.println((8 - r.cardinality()) * (8 - c.cardinality()));
    }
}