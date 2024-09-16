import java.io.*;
import java.math.*;
import java.util.*;

public class fjoldibokstafa
{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        char[] s = r.readLine().toCharArray();
        int ret = 0;
        for(char c : s)
            ret += (Character.isLetter(c)) ? 1 : 0;
        System.out.println(ret);
    }
}