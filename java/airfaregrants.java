import java.io.*;
import java.util.*;

public class airfaregrants {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE, max = -1;
        while(N-- > 0) {
            int P = Integer.parseInt(br.readLine());
            min = P < min ? P : min;
            max = P > max ? P : max;
        }
        max = min - max / 2;
        System.out.println(max < 0 ? 0 : max);
    }
}