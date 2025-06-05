import java.io.*;
import java.util.*;
public class heysata {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        char c = br.readLine().toCharArray()[0];
        String s = br.readLine();
        System.out.println((s.indexOf(c) > -1) ? "Unnar fann hana!" : "Unnar fann hana ekki!");
    }
}