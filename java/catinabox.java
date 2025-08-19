import java.io.*;
import java.util.*;

public class catinabox {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] hwlc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int p = hwlc[0] * hwlc[1] * hwlc[2];
        System.out.println(p == hwlc[3] ? "COZY" : (p < hwlc[3] ? "TOO TIGHT" : "SO MUCH SPACE"));
    }
}