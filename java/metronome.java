import java.io.*;
public class metronome {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(scan.readLine());
        double d = i / 4.0;
        System.out.println(String.format("%.2f", d));
    }
}