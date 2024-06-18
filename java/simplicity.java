import java.io.*;
import java.util.*;
public class simplicity {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        char[] c = r.readLine().toCharArray();
        int[] a = new int[26];
        for(char h : c)
            a[h - 'a']++;
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for(int i : a)
            pq.add(i);
        pq.poll();
        pq.poll();
        int ret = 0;
        while(!pq.isEmpty())
            ret += pq.poll();
        System.out.println(ret);
    }
}