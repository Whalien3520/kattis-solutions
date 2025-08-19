import java.io.*;
import java.util.*;

public class thirteenfloors {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(x > 12 ? x + 1 : x);
    }
}