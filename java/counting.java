import java.io.*;
import java.util.*;

public class counting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 12; i++)
            System.out.println(i * n);
    }
}