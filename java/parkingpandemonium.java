import java.io.*;
import java.util.*;

public class parkingpandemonium {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        br.readLine();
        System.out.println(M * Integer.parseInt(br.readLine()));
    }
}