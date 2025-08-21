import java.io.*;
import java.util.*;

public class skener {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] rcz = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int r = 0; r < rcz[0]; r++) {
            char[] a = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int c = 0; c < rcz[1]; c++)
                for(int zc = 0; zc < rcz[3]; zc++)
                    sb.append(a[c]);
            for(int zr = 0; zr < rcz[2]; zr++)
                System.out.println(sb.toString());
        }
    }
}