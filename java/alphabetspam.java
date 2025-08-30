import java.io.*;
import java.util.*;

public class alphabetspam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] r = br.readLine().toCharArray();
        int w = 0, l = 0, u = 0, s = 0;
        for(char c : r) {
            if(c == '_')
                w++;
            else if('a' <= c && c <= 'z')
                l++;
            else if('A' <= c && c <= 'Z')
                u++;
            else
                s++;
        }
        double n = r.length;
        System.out.println(String.format("%f\n%f\n%f\n%f", w / n, l / n, u / n, s / n));
    }
}