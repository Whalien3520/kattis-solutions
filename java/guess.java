import java.io.*;
import java.util.*;
public class guess {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int l= 1, h = 1000;
        while(true) {
            int m = (l + h) / 2;
            System.out.println(m);
            String s = r.readLine();
            if(s.equals("correct"))
                break;
            if(s.equals("lower"))
                h = m - 1;
            else
                l = m + 1;
        }
    }
}