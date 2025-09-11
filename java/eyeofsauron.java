import java.io.*;
import java.util.*;

public class eyeofsauron {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.length() % 2 == 1 || s.charAt(s.length() / 2) != ')' ? "fix" : "correct");
    }
}