import java.io.*;
import java.util.*;
public class problemclassification {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(r.readLine());
        HashMap<String, ArrayList<String>> cat = new HashMap<>();
        HashMap<String, Integer> cnt = new HashMap<>();
        while(N-- > 0) {
            String[] ar = r.readLine().split(" ");
            cnt.put(ar[0], 0);
            for(int i = 2; i < ar.length; i++) {
                if(cat.get(ar[i]) == null)
                    cat.put(ar[i], new ArrayList<>());
                cat.get(ar[i]).add(ar[0]);
            }
        }
        
        String s;
        while((s = r.readLine()) != null) {
            String[] ar = s.split(" ");
            for(String t : ar)
                if(cat.get(t) != null) {
                    for(String i : cat.get(t))
                        cnt.put(i, cnt.get(i) + 1);
                }
        }
        
        Iterator<String> iter = cnt.keySet().iterator();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> cnt.get(a) - cnt.get(b) == 0 ? a.compareTo(b) : cnt.get(b) - cnt.get(a));
        while(iter.hasNext())
            pq.add(iter.next());
        String t = pq.poll();
        int ret = cnt.get(t);
        System.out.println(t);
        while(!pq.isEmpty() && cnt.get(t = pq.poll()) == ret)
            System.out.println(t);
    }
}