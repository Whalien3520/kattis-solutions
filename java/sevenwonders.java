import java.io.*;
import java.util.*;

public class sevenwonders {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] r = br.readLine().toCharArray();
        int t = 0, c = 0, g = 0;
        for(char a : r) {
            if(a == 'T')
                t++;
            else if(a == 'C')
                c++;
            else
                g++;
        }
        System.out.println(t * t + c * c + g * g + 7 * (Math.min(t, Math.min(c, g))));
    }
}