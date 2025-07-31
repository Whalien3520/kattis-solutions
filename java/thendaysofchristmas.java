import java.io.*;
import java.util.*;

public class thendaysofchristmas {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N * (N + 1) / 2);
        System.out.println(N * (N + 1) * (N + 2) / 6);
    }
}