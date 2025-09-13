import java.io.*;
import java.util.*;

public class pokechat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray(), e = br.readLine().toCharArray();
        for(int i = 0; i < e.length; i += 3)
            System.out.print(s[100 * (e[i] - '0') + 10 * (e[i + 1] - '0') + e[i + 2] - '0' - 1]);
    }
}