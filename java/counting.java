import java.io.*;
import java.math.*;
import java.util.*;

public class counting {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 12; i++)
            System.out.println(i * n);
    }
}
