import java.io.*;
import java.util.*;

public class blackthorn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s.indexOf("kth") == -1 ? "no" : "yes");
    }
}