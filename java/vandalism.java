import java.io.*;
import java.util.*;

public class vandalism {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = 0;
        for(char c : "UAPC".toCharArray()) {
            if(i < s.length() && s.charAt(i) == c)
                i++;
            else
                System.out.print(c);
        }
    }
}