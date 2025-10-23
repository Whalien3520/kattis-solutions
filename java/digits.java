import java.io.*;
import java.math.*;
import java.util.*;

public class digits {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s;
        while(!(s = br.readLine()).equals("END")) {
            int ret = 1;
            String n = Integer.toString(s.length());
            while(!n.equals(s)) {
                s = n;
                n = Integer.toString(s.length());
                ret++;
            }
            System.out.println(ret);
        }
    }
}