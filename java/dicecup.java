import java.io.*;
import java.util.*;

public class dicecup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), s = new int[NM[0] + NM[1] + 2];
        for(int i = 1; i <= NM[0]; i++)
            for(int j = 1; j <= NM[1]; j++)
                s[i + j]++;
        int max = 2;
        while(s[max + 1] > s[max])
            max++;
        for(int i = max; s[i] == s[max]; i++)
            System.out.println(i);
    }
}