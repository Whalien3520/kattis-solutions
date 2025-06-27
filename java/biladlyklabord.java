import java.io.*;
import java.util.*;

public class biladlyklabord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(s.charAt(0));
        for(int i = 1; i < s.length(); i++)
            if(s.charAt(i) != s.charAt(i - 1))
                System.out.print(s.charAt(i));
    }
}