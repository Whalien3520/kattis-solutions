import java.io.*;
import java.util.*;

public class sith {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
        if(a - b >= 0) {
            System.out.println("VEIT EKKI");
            return;
        }
        int ab = Integer.parseInt(br.readLine());
        System.out.println(ab < 0 ? "JEDI" : "SITH");
    }
}