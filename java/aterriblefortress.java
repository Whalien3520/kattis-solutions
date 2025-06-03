import java.io.*;
import java.util.*;

public class aterriblefortress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), ret = 0;
        while(n-- > 0)
            ret += Integer.parseInt(br.readLine());
        System.out.println(ret);
    }
}