import java.io.*;
import java.util.*;

public class leftbeehind {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if(a[0] == 0 && a[1] == 0)
                return;
            System.out.println(a[0] + a[1] == 13 ? "Never speak again." : (a[0] == a[1] ? "Undecided." : (a[0] > a[1] ? "To the convention." : "Left beehind.")));
        }
    }
}