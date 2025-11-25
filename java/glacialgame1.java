import java.io.*;
import java.math.*;
import java.util.*;

public class glacialgame1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        char[][] m = new char[8][];
        for(int i = 0; i < 8; i++)
            m[i] = br.readLine().toCharArray();
        int retn = 0, retr = -1, retc = -1;
        int[][] moves = new int[][] {{1, 0}, {1, 1}, {0, 1}, {-1, 1}, {-1, 0}, {-1, -1}, {0, -1}, {1, -1}};
        for(int r = 0; r < 8; r++)
            for(int c = 0; c < 8; c++) {
                if(m[r][c] != '.')
                    continue;
                int f = 0;
                for(int[] move : moves) {
                    int n = 0;
                    int rr = r + move[0], cc = c + move[1];
                    while(0 <= rr && rr < 8 && 0 <= cc && cc < 8 && m[rr][cc] == 'W') {
                        rr += move[0];
                        cc += move[1];
                        n++;
                    }
                    if(0 > rr || rr >= 8 || 0 > cc || cc >= 8 || m[rr][cc] != 'B')
                        continue;
                    f += n;
                }
                if(f > retn) {
                    retn = f;
                    retr = r;
                    retc = c;
                }
            }
        System.out.println(retr + " " + retc);
            
    }
}