import java.io.*;
import java.util.*;

public class cattoys {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(NK[0] / NK[1] + (NK[0] % NK[1] > 0 ? 1 : 0));
    }
}