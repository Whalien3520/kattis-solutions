import java.io.*;
import java.math.*;
import java.util.*;

public class tictactoe2 {
    static HashSet<Integer> set;
    public static void main(String[] args) throws IOException {
        set = new HashSet<>();
        recurse(0, true, 0);
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        while(N-- > 0) {
            char[][] board = new char[3][3];
            for(int i = 0; i < 3; i++)
                board[i] = r.readLine().toCharArray();
            r.readLine();
            int mask = 0, mult = 1;
            for(int i = 0; i < 3; i++)
                for(int j = 0; j < 3; j++) {
                    if(board[i][j] == 'X')
                        mask += mult;
                    else if(board[i][j] == 'O')
                        mask += 2 * mult;
                    mult *= 3;
                }
            System.out.println(set.contains(mask) ? "yes" : "no");
        }
    }
    private static void recurse(int step, boolean x, int mask) {
        set.add(mask);
        if(step == 9)
        	return;
        int[][] board = new int[3][3];
        int copy = mask;
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                board[i][j] = copy % 3;
                copy /= 3;
            }
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++) {
                if(board[i][j] != 0)
                    continue;
                board[i][j] = x ? 1 : 2;
                mask += (x ? 1 : 2) * Math.pow(3, i * 3 + j);
                if((board[i][0] == board[i][1] && board[i][0] == board[i][2])
                || (board[0][j] == board[1][j] && board[0][j] == board[2][j])
                || (i == j && board[0][0] == board[1][1] && board[0][0] == board[2][2])
                || (i + j == 2 && board[0][2] == board[1][1] && board[0][2] == board[2][0]))
                    set.add(mask);
                else
                    recurse(step + 1, !x, mask);
                board[i][j] = 0;
                mask -= (x ? 1 : 2) * Math.pow(3, i * 3 + j);
            }
    }
}