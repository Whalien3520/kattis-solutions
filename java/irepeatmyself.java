import java.io.*;
import java.math.*;
import java.util.*;

public class irepeatmyself {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        while(n-- > 0) {
            char[] c = br.readLine().toCharArray();
            boolean flag;
            int i = 1;
            while(i < c.length) {
                flag = true;
                for(int j = i; j < c.length && flag; j += i)
                    for(int k = 0; k < i && j + k < c.length && flag; k++)
                        flag = c[k] == c[j + k];
                if(flag)
                    break;
                i++;
            }
            bw.write(i + "\n");
            bw.flush();
        }
    }
}