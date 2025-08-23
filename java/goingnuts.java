import java.io.*;
import java.util.*;

public class goingnuts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ret = 0;
        while(n > 0) {
            ret += n & 1;
            n >>= 1;
        }
        System.out.println(ret);
    }
}