import java.io.*;
import java.util.*;

public class mixedfractions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s = br.readLine()).equals("0 0")) {
            int[] a = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println((a[0] / a[1]) + " " + (a[0] % a[1]) + " / " + a[1]);
        }
    }
}