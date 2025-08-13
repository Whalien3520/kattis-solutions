import java.io.*;
import java.util.*;

public class mylla2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] a = new char[3][];
        for(int i = 0; i < 3; i++)
            a[i] = br.readLine().toCharArray();
        boolean ret = a[1][1] == 'O' && ((a[0][0] == 'O' && a[2][2] == 'O') || (a[0][2] == 'O' && a[2][0] == 'O'));
        for(int i = 0; !ret && i < 3; i++) {
            boolean row = true, col = true;
            for(int j = 0; (row || col) && j < 3; j++) {
                row &= a[i][j] == 'O';
                col &= a[j][i] == 'O';
            }
            ret |= (row || col);
        }
        System.out.println(ret ? "Jebb" : "Neibb");
    }
}