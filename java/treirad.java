import java.io.*;
import java.util.*;

public class treirad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine()), i = 1;
        while((i * (i + 1) * (i + 2)) < N)
            i++;
        System.out.println(i - 1);
    }
}