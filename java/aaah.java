import java.io.*;
import java.math.*;
import java.util.*;

public class aaah {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String a = br.readLine(), b = br.readLine();
        bw.write(a.length() < b.length() ? "no\n" : "go\n");
        bw.flush();
    }
}
