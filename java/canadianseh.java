import java.io.*;
import java.util.*;

public class canadianseh {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.substring(s.length() - 3).equals("eh?") ? "Canadian!" : "Imposter!");
    }
}