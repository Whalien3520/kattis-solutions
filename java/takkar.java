import java.io.*;
import java.math.*;
import java.util.*;

public class takkar {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(r.readLine()), b = Integer.parseInt(r.readLine());
        if(a > b)
            System.out.println("MAGA!");
        else if(b > a)
            System.out.println("FAKE NEWS!");
        else
            System.out.println("WORLD WAR 3!");
    }
}