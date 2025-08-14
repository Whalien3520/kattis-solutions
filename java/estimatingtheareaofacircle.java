import java.io.*;
import java.util.*;

public class estimatingtheareaofacircle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s = br.readLine()).equals("0 0 0")) {
            double[] a = Arrays.stream(s.split(" ")).mapToDouble(Double::parseDouble).toArray();
            //System.out.println(a[0] + "//" + a[1] + "//" + a[2]);
            //String[] a = s.split(" ");
            //double d = Double.parseDouble(a[0]);
            //int m = Integer.parseInt(a[1]), c = Integer.parseInt(a[2]);
            System.out.println((a[0] * a[0] * Math.PI) + " " + (a[2] / a[1] * a[0] * a[0] * 4));
        }
    }
}