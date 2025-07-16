import java.io.*;
import java.util.*;

public class skammstofun {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] a = br.readLine().split(" ");
        for(String s : a)
            if('A' <= s.charAt(0) && s.charAt(0) <= 'Z')
                System.out.print(s.charAt(0));
    }
}