import java.io.*;
import java.util.*;

public class titlecost {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        double d = Double.parseDouble(a[1]);
        System.out.println(a[0].length() > d ? d : a[0].length());
    }
}