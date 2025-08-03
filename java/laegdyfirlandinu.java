import java.io.*;
import java.util.*;

public class laegdyfirlandinu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] m = new int[nm[0]][nm[1]];
        boolean flag = true;
        for(int i = 0; i < nm[0]; i++)
            m[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 1; flag && i + 1 < nm[0]; i++)
            for(int j = 1; flag && j + 1 < nm[1]; j++)
                flag = m[i][j] >= Math.min(Math.min(m[i - 1][j], m[i][j - 1]), Math.min(m[i + 1][j], m[i][j + 1]));
        System.out.println(flag ? "Neibb" : "Jebb");
    }
}