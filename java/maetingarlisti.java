import java.io.*;
import java.util.*;

public class maetingarlisti {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nrc = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String[][] a = new String[nrc[1]][nrc[2]];
        for(int i = 0; i < nrc[1]; i++)
            a[i] = br.readLine().split(" ");
        for(int i = 0; i < nrc[1]; i++) {
            boolean ret = true, flag = true;
            for(int j = 0; j < nrc[2]; j++) {
                String s = br.readLine();
                if(flag) {
                    if(a[i][j].equals(s) && !a[i][nrc[2] - j - 1].equals(s))
                        flag = false;
                    if(!a[i][j].equals(s) && a[i][nrc[2] - j - 1].equals(s)) {
                        ret = false;
                        flag = false;
                    }
                }
            }
            System.out.println(ret ? "left" : "right");
        }
    }
}