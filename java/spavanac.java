import java.io.*;
import java.util.*;

public class spavanac {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] HM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int H = HM[0] - (HM[1] < 45 ? 1 : 0), M = HM[1] - 45;
        System.out.println((H + (H < 0 ? 24 : 0)) + " " + (M + (M < 0 ? 60 : 0)));
    }
}