import java.io.*;
import java.util.*;

public class asciikassi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        bw.write("+");
        for(int i = 0; i < N; i++)
            bw.write("-");
        bw.write("+\n");
        for(int i = 0; i < N; i++) {
            bw.write("|");
            for(int j = 0; j < N; j++)
                bw.write(" ");
            bw.write("|\n");
        }
        bw.write("+");
        for(int i = 0; i < N; i++)
            bw.write("-");
        bw.write("+\n");
        bw.flush();
    }
}