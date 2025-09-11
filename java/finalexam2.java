import java.io.*;
import java.util.*;

public class finalexam2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ret = 0;
        char p = br.readLine().charAt(0);
        while(--n > 0) {
            char c = br.readLine().charAt(0);
            ret += p == c ? 1 : 0;
            p = c;
        }
        System.out.println(ret);
    }
}