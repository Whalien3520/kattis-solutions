import java.io.*;
import java.util.*;

public class kingarthur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Double.parseDouble(br.readLine()) * Math.PI >= Double.parseDouble(br.readLine()) * Integer.parseInt(br.readLine()) ? "YES" : "NO");
    }
}