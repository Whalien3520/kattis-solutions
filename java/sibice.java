import java.io.*;
import java.util.*;

public class sibice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NWH = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        NWH[1] = NWH[1] * NWH[1] + NWH[2] * NWH[2];
        while(NWH[0]-- > 0) {
            int i = Integer.parseInt(br.readLine());
            System.out.println(i * i <= NWH[1] ? "DA" : "NE");
        }
    }
}