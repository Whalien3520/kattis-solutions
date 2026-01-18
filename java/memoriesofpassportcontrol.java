import java.io.*;
import java.math.*;
import java.util.*;

public class memoriesofpassportcontrol {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] ks = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((ks[1] % ks[0]) + (ks[1] / ks[0]));
    }
}