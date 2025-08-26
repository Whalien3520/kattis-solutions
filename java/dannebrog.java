import java.io.*;
import java.util.*;

public class dannebrog {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(br.readLine());
        System.out.println((b * 3 / 7) * (b * 3 / 7) * 5);
    }
}