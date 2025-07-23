import java.io.*;
import java.util.*;

public class grading {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int e = Integer.parseInt(br.readLine());
        System.out.println(e >= a[0] ? 'A' : (e >= a[1] ? 'B' : (e >= a[2] ? 'C' : (e >= a[3] ? 'D' : (e >= a[4] ? 'E' : 'F')))));
    }
}