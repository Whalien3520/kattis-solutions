import java.io.*;
import java.util.*;

public class nastyhacks {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            int[] rec = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            rec[1] -= rec[2];
            System.out.println(rec[0] == rec[1] ? "does not matter" : rec [0] < rec[1] ? "advertise" : "do not advertise");
        }
    }
}