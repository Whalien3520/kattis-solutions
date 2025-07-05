import java.io.*;
import java.util.*;

public class aaah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(), b = br.readLine();
        System.out.println(a.length() < b.length() ? "no" : "go");
    }
}