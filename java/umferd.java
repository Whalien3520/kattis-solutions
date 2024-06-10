import java.io.*;
import java.util.*;
public class umferd {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());
        double t = m * n;
        int c = 0;
        while(n-- > 0) {
            String s = r.readLine();
            for(int i = 0; i < s.length(); i++)
                if(s.charAt(i) == '.')
                    c++;
        }
        System.out.println(c / t);
    }
}