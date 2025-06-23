import java.io.*;
import java.util.*;

public class lettasta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), M = Integer.parseInt(br.readLine());
        String[] a = br.readLine().split(" ");
        int[] n = new int[N];
        while(M-- > 0) {
            int[] t = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int i = 0; i < N; i++)
                n[i] += t[i];
        }
        int m = 0;
        for(int i = 1; i < N; i++)
            if(n[i] > n[m])
                m = i;
        System.out.println(a[m]);
    }
}