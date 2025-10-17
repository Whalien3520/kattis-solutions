import java.io.*;
import java.util.*;

public class findingforks {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int m1 = Integer.MAX_VALUE, m2 = Integer.MAX_VALUE;
        for(int i : a) {
            if(i < m1) {
                m2 = m1;
                m1 = i;
            }
            else if(i < m2)
                m2 = i;
        }
        System.out.println(m1 + m2);
    }
}