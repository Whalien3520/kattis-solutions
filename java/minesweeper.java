import java.io.*;
import java.util.*;

public class minesweeper {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nmk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] a = new char[nmk[0]][nmk[1]];
        while(nmk[2]-- > 0) {
            int[] xy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            a[xy[0] - 1][xy[1] - 1] = '*';
        }
        for(char[] r : a) {
            for(char c : r) {
                if(c == 0)
                    System.out.print('.');
                else
                    System.out.print('*');
            }
            System.out.println();
        }
    }
}