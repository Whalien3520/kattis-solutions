import java.io.*;
import java.util.*;

public class skruop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), v = 7;
        while(n-- > 0)
            v += br.readLine().equals("Skru op!") ? (v == 10 ? 0 : 1) : (v == 0 ? 0 : -1);
        System.out.println(v);
    }
}