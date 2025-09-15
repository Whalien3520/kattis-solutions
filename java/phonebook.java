import java.io.*;
import java.util.*;

public class phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), ret = 0;
        while(N-- > 0) {
            char[] a = br.readLine().toCharArray();
            ret += (a.length == 12 || a.length == 13) && a[0] == '+' && a[1] == '3' && a[2] == '9' ? 1 : 0;
        }
        System.out.println(ret);
    }
}