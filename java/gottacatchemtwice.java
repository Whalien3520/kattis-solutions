import java.io.*;
import java.math.*;
import java.util.*;

public class gottacatchemtwice {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        Set<String> s = new HashSet<>();
        while(N-- > 0)
            s.add(br.readLine());
        System.out.println(s.size() + 1);
    }
}