import java.io.*;
import java.util.*;

public class akureyri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> s = new HashMap<>();
        while(N-- > 0) {
            br.readLine();
            String t = br.readLine();
            s.put(t, s.getOrDefault(t, 0) + 1);
        }
        for(String t : s.keySet())
            System.out.println(t + " " + s.get(t));
    }
}