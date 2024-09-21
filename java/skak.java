import java.io.*;
import java.math.*;
import java.util.*;

public class skak
{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] x = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] y = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(x[0] == y[0] || x[1] == y[1])
            System.out.println(1);
        else
            System.out.println(2);
    }
}