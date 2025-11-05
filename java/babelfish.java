import java.io.*;
import java.math.*;
import java.util.*;

public class babelfish {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Map<String, String> d = new HashMap<>();
        String s;
        while(!(s = br.readLine()).equals("")) {
            String[] a = s.split(" ");
            d.put(a[1], a[0]);
        }
        while((s = br.readLine()) != null)
            bw.write(String.format("%s\n", d.getOrDefault(s, "eh")));
        bw.flush();
    }
}