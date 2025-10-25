import java.io.*;
import java.math.*;
import java.util.*;

public class rollcall {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s;
        Map<String, Integer> m = new HashMap<>();
        PriorityQueue<String[]> pq = new PriorityQueue<>((a, b) -> a[1].compareTo(b[1]) != 0 ? a[1].compareTo(b[1]) : a[0].compareTo(b[0]));
        while((s = br.readLine()) != null) {
            String[] a = s.split(" ");
            m.put(a[0], m.getOrDefault(a[0], 0) + 1);
            pq.add(a);
        }
        while(!pq.isEmpty()) {
            String[] a = pq.poll();
            bw.write(a[0]);
            if(m.get(a[0]) > 1)
                bw.write(" " + a[1]);
            bw.newLine();
        }
        bw.flush();
    }
}