import java.io.*;
import java.util.*;

public class planina {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = (int)Math.pow(2, Integer.parseInt(br.readLine())) + 1;
        System.out.println(a * a);
    }
}