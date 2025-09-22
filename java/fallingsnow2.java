import java.io.*;
import java.util.*;

public class fallingsnow2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] c = new int[NM[1]];
        for(int i = 0; i < NM[0]; i++) {
            char[] a = br.readLine().toCharArray();
            for(int j = 0; j < NM[1]; j++)
                c[j] += a[j] == 'S' ? 1 : 0;
        }
        for(int i = NM[0]; i > 0; i--) {
            for(int j = 0; j < NM[1]; j++)
                System.out.print(c[j] >= i ? 'S' : '.');
            System.out.println();
        }
    }
}