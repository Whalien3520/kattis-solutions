import java.io.*;
import java.util.*;

public class afjormun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            String s = br.readLine();
            System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
        }
    }
}