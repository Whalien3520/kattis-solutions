import java.io.*;
import java.math.*;
import java.util.*;
public class tictactoeai {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st = new StringTokenizer("");
    private static String next() {
        if(!st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }
    private static int nextInt() {
        return Integer.parseInt(next());
    }
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        char c = next().charAt(0);
        char[][] b = new char[3][3];
        for(int i = 0; i < 3; i++)
            b[i] = next().toCharArray();
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3 && sb.length() == 0; j++)
                if(b[i][j] == 'E' && ((b[(i + 1) % 3][j] == c && b[(i + 2) % 3][j] == c) || (b[i][(j + 1) % 3] == c && b[i][(j + 2) % 3] == c)))
                    sb.append(String.format("%d %d", i + 1, j + 1));
        for(int i = 0; i < 3 && sb.length() == 0; i++) {
            if(b[i][i] == 'E' && b[(i + 1) % 3][(i + 1) % 3] == c && b[(i + 2) % 3][(i + 2) % 3] == c)
                sb.append(String.format("%d %d", i + 1, i + 1));
            else if(b[i][2 - i] == 'E' && b[(i + 1) % 3][2 - ((i + 1) % 3)] == c && b[(i + 1) % 3][2 - ((i + 2) % 3)] == c)
                sb.append(String.format("%d %d", i + 1, 3 - i));
        }
        System.out.print(sb);
    }
}