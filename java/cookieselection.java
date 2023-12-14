import java.io.*;
import java.util.*;
public class cookieselection {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> min = new PriorityQueue<>(), max = new PriorityQueue<>(Comparator.reverseOrder());
        String s;
        while((s = scan.readLine()) != null) {
            if(s.charAt(0) == '#') {
            	System.out.println(min.poll());
            	if(min.size() < max.size())
            		min.add(max.poll());
            }
            else {
            	int i = Integer.parseInt(s);
            	if(min.size() == max.size()) {
            		max.add(i);
            		min.add(max.poll());
            	}
            	else {
            		min.add(i);
            		max.add(min.poll());
            	}
            }
        }
    }
}