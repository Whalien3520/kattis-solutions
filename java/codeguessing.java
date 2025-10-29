import java.io.*;
import java.math.*;
import java.util.*;

public class codeguessing {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] pq = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String s = br.readLine();
        int l = s.indexOf('A'), r = s.lastIndexOf('A');
        if(l == 0) {
            if(r == 1)
                bw.write(String.format("%s", pq[1] == 7 ? "8 9" : -1));
            else if(r == 2)
                bw.write(String.format("%s", pq[1] == 8 && pq[0] == 6 ? "7 9" : -1));
            else
                bw.write(String.format("%s", pq[1] - pq[0] == 3 ? (pq[0] + 1) + " " + (pq[1] - 1) : -1));
        }
        else if (l == 1) {
            if(r == 2)
                bw.write(String.format("%s", pq[0] == 2 && pq[1] == 8 ? "1 9" : -1));
            else
                bw.write(String.format("%s", pq[0] == 2 && pq[1] == 4 ? "1 3" : -1));
        }
        else
            bw.write(String.format("%s", pq[0] == 3 ? "1 2" : -1));
        bw.flush();
    }
}