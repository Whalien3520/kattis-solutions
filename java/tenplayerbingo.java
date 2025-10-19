import java.io.*;
import java.util.*;

public class tenplayerbingo {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        char c = s.charAt(s.length() - 1);
        System.out.println(c == '0' ? "10" : c);
    }
}