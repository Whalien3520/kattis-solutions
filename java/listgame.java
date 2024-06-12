import java.io.*;
import java.util.*;
public class listgame {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(r.readLine());
        int ret = 0;
        while(X % 2 == 0) {
            ret++;
            X /= 2;
        }
        for(int i = 3; i <= Math.sqrt(X); i += 2) {
            while(X % i == 0) {
                ret++;
                X /= i;
            }
        }
        if(X > 2)
            ret++;
        System.out.println(ret);
    }
}