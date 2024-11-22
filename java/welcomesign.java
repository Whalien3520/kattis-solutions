import java.io.*;
import java.math.*;
import java.util.*;

public class welcomesign {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] rc = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean l = false;
        while(rc[0]-- > 0) {
            String s = r.readLine();
            int i = rc[1] - s.length();
            for(int n = 0; n < i / 2 + ((i % 2 == 1 && l) ? 1 : 0); n++)
                System.out.print(".");
            System.out.print(s);
            for(int n = 0; n < i / 2 + ((i % 2 == 1 && !l) ? 1 : 0); n++)
                System.out.print(".");
            System.out.println();
            if(i % 2 == 1)
                l = !l;
        }
    }
}