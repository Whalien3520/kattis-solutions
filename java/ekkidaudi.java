import java.io.*;
import java.util.*;

public class ekkidaudi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("\\|"), b = br.readLine().split("\\|");
        System.out.println(a[0] + b[0] + " " + a[1] + b[1]);
    }
}