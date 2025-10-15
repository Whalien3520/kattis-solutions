import java.io.*;
import java.util.*;

public class backspace {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        StringBuilder ret = new StringBuilder();
		// missing test cases for if backspace empty string
        for(int i = 0; i < a.length; i++) {
            if(a[i] == '<')
                ret.deleteCharAt(ret.length() - 1);
            else
                ret.append(a[i]);
        }
        System.out.println(ret);
    }
}