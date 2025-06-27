import java.io.*;
import java.util.*;

public class hakkari {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
        int c = 0;
        for(int i = 0; i < nm[0]; i++) {
            String s = br.readLine();
            for(int j = 0; j < nm[1]; j++)
                if(s.charAt(j) == '*') {
                    c++;
                    sb.append((i + 1) + " " + (j + 1) + "\n");
                }
        }
        System.out.println(c);
        System.out.print(sb.toString());
    }
}