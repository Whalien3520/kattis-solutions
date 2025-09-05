import java.io.*;
import java.util.*;

public class rollingthedice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int X = Integer.parseInt(s.substring(0, s.indexOf('d'))), Y = Integer.parseInt(s.substring(s.indexOf('d') + 1, s.indexOf('+'))), Z = Integer.parseInt(s.substring(s.indexOf('+') + 1));
        System.out.println(X * (Y + 1.0) / 2 + Z);
    }
}