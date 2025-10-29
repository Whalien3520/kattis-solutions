import java.io.*;
import java.math.*;
import java.util.*;

public class gameparty {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int G = Integer.parseInt(br.readLine());
        if(G == 0) {
            System.out.println(1);
            return;
        }
        int[] S = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        G = 1;
        for(int i : S)
            G += i;
        System.out.println(G % 3);
    }
}