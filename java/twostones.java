import java.io.*;
import java.util.*;
public class twostones {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        System.out.println((N % 2 == 0) ? "Bob" : "Alice");
    }
}