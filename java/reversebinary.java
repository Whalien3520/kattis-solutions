import java.io.*;
import java.util.*;

public class reversebinary {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Boolean> l = new ArrayList<>();
        while(N > 0) {
            l.add(N % 2 == 1);
            N /= 2;
        }
        for(int i = 0; i < l.size(); i++)
            N += l.get(l.size() - i - 1) ? (int)Math.pow(2, i) : 0;
        System.out.println(N);
    }
}