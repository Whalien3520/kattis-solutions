import java.io.*;
import java.util.*;

public class popcount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int i = 0;
        for(char c : a)
            i += c - '0';
        System.out.println(i);
    }
}