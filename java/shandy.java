import java.io.*;
import java.util.*;

public class shandy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int B = Integer.parseInt(br.readLine()), L = Integer.parseInt(br.readLine());
        System.out.println((B < L ? B : L) * 2);
    }
}