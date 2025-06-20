import java.io.*;
import java.util.*;

public class fimmtudagstilbod {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());
        System.out.println(1000 + (i < 2021 ? 0 : ((i - 2020) * 100)));
    }
}