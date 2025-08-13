import java.io.*;
import java.util.*;

public class stafur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.equals("Y") ? "Kannski" : ("AEIOU".indexOf(s) > -1 ? "Jebb" : "Neibb"));
    }
}