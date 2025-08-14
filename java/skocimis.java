import java.io.*;
import java.util.*;

public class skocimis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ABC = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Math.max(ABC[1] - ABC[0], ABC[2] - ABC[1]) - 1);
    }
}