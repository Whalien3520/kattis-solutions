import java.io.*;
import java.math.*;
import java.util.*;

public class vedurheidar
{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(r.readLine()), n = Integer.parseInt(r.readLine());
        while(n-- > 0) {
            String[] s = r.readLine().split(" ");
            if(Integer.parseInt(s[1]) < v)
                System.out.println(s[0] + " lokud");
            else
                System.out.println(s[0] + " opin");
        }
    }
}