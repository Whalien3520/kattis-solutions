import java.util.*;
import java.io.*;
public class fifa {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine()), k = Integer.parseInt(scan.readLine());
        System.out.println(2022+n/k);
    }
}