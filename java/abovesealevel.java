import java.io.*;
import java.math.*;
import java.util.*;

public class abovesealevel {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        bw.write(String.format("%f\n", Double.parseDouble(br.readLine()) - 0.3));
        bw.flush();
    }
}
