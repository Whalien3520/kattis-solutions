import java.io.*;
import java.math.*;
import java.util.*;

public class eatingout {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] mabc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        bw.write(String.format("%s\n", (mabc[1] + mabc[2] - mabc[0]) + mabc[3] <= mabc[0] ? "possible" : "impossible"));
        bw.flush();
    }
}