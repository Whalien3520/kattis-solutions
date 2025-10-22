import java.io.*;
import java.util.*;

public class zoom {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), x = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = nk[1] - 1; i < nk[0]; i += nk[1])
            System.out.print(x[i] + " ");
    }
}
