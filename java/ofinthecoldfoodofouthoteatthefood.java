import java.io.*;
import java.math.*;
import java.util.*;

public class ofinthecoldfoodofouthoteatthefood {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        double[] TH = Arrays.stream(br.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        bw.write(String.format("%f\n", TH[1] / 2 <= TH[0] ? TH[0] - (TH[1] / 2) + TH[1] : Math.sqrt(2 * TH[0] * TH[1])));
        bw.flush();
    }
}