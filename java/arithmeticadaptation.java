import java.io.*;
import java.util.*;

public class arithmeticadaptation {
    static BufferedReader br;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        if(x < 0) {
            if(x == -1)
                System.out.println("-2 1");
            else
                System.out.println(-1 + " " + (x + 1));
        }
        else if(x > 0) {
            if(x == 1)
                System.out.println("-1 2");
            else
                System.out.println(1 + " " + (x - 1));
        }
        else
            System.out.println("-1 1");
    }
}