import java.io.*;
import java.util.*;

public class nafnauki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split("\\.");
        System.out.println("." + a[a.length - 1]);
    }
}