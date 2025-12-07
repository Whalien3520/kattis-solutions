import java.io.*;
import java.math.*;
import java.util.*;

public class framvindustika {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] pw = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int p = pw[0] * pw[1] / 100;
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0; i < p; i++)
            sb.append('#');
        for(int i = p; i < pw[1]; i++)
            sb.append('-');
        sb.append(String.format("] | %3d%%", pw[0]));
        System.out.println(sb);
    }
}