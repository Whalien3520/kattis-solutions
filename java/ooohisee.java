import java.io.*;
import java.util.*;

public class ooohisee {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] rc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(rc[0] < 3) {
            System.out.println("Oh no!");
            return;
        }
        char[] p2 = br.readLine().toCharArray(), p1 = br.readLine().toCharArray();
        int n = 0, r = -1, c = -1;
        for(int i = 2; i < rc[0]; i++) {
            char[] x = br.readLine().toCharArray();
            for(int j = 1; j + 1 < rc[1]; j++)
                if(p1[j] == '0' && p2[j - 1] == 'O' && p2[j] == 'O' && p2[j + 1] == 'O' && p1[j - 1] == 'O' && p1[j + 1] == 'O' && x[j - 1] == 'O' && x[j] == 'O' && x[j + 1] == 'O') {
                    r = i;
                    c = j + 1;
                    n++;
                }
            p2 = p1;
            p1 = x;
        }
        System.out.println(n == 1 ? r + " " + c : "Oh no! " + (n == 0 ? "" : n + " locations"));
    }
}