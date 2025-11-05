import java.io.*;
import java.math.*;
import java.util.*;

public class piglatin {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        while((s = br.readLine()) != null) {
            String[] a = s.split(" ");
            for(String g : a) {
                int i = 0;
                while("aeiouy".indexOf(g.charAt(i)) == -1)
                    i++;
                if(i == 0) {
                    bw.write(String.format("%syay ", g));
                    continue;
                }
                bw.write(String.format("%s%say ", g.substring(i), g.substring(0, i)));
            }
            bw.newLine();
        }
        bw.flush();
    }
}