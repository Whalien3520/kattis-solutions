import java.io.*;
import java.util.*;

public class doublepassword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray(), b = br.readLine().toCharArray();
        int ret = 1;
        for(int i = 0; i < a.length; i++)
            if(a[i] != b[i])
                ret *= 2;
        System.out.println(ret);
    }
}