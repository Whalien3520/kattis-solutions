import java.io.*;
import java.util.*;
public class hipphipphurra {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String n = r.readLine();
        int i = Integer.parseInt(r.readLine());
        while(i-- > 0)
            System.out.println("Hipp hipp hurra, " + n + "!");
    }
}