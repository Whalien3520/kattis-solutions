import java.io.*;
import java.util.*;

public class trik {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i = 1;
        for(char c : s.toCharArray()) {
            if(c == 'A') {
                if(i == 1 || i == 2)
                    i = 3 - i;
            }
            else if(c == 'B') {
                if(i == 2 || i == 3)
                    i = 5 - i;
            }
            else if(c == 'C') {
                if(i == 1 || i == 3)
                    i = 4 - i;
            }
        }
        System.out.println(i);
    }
}