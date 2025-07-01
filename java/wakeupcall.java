import java.io.*;
import java.util.*;

public class wakeupcall {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] N = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), M = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = 0, b = 0;
        for(int i : N)
            a += i;
        for(int i : M)
            b += i;
        System.out.println(a == b ? "Oh no" : ("Button " + (a > b ? 1 : 2)));
    }
}