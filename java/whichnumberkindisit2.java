import java.io.*;
import java.util.*;

public class whichnumberkindisit2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine()), r = (int)Math.sqrt(N);
            if(N % 2 == 1)
                System.out.print("O");
            if(r * r == N)
                System.out.print("S");
            else if(N % 2 == 0)
                System.out.print("EMPTY");
            System.out.println();
        }
    }
}
