import java.io.*;
import java.math.*;
import java.util.*;

public class knightsmove {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        char[] l = br.readLine().toCharArray();
        int[][] moves = new int[][] {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        for(int[] move : moves) {
            char r = (char)(l[0] + move[0]), c = (char)(l[1] + move[1]);
            if('a' <= r && r <= 'h' && '1' <= c && c <= '8')
                System.out.println(r + "" + c);
        }
    }
}