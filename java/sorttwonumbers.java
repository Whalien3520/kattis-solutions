import java.io.*;
import java.util.*;

public class sorttwonumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println((ab[0] < ab[1]) ? (ab[0] + " " + ab[1]) : (ab[1] + " " + ab[0]));
    }
}