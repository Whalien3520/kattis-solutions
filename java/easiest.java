import java.io.*;
import java.util.*;

public class easiest {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i;
        while((i = Integer.parseInt(br.readLine())) != 0) {
            int j = i, dr = 0;
            while(j > 0) {
                dr += j % 10;
                j /= 10;
            }
            j = 11;
            while(true) {
                int p = i * j, s = 0;
                while(p > 0) {
                    s += p % 10;
                    p /= 10;
                }
                if(s == dr) {
                    System.out.println(j);
                    break;
                }
                j++;
            }
        }
    }
}