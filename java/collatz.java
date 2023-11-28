import java.io.*;
import java.util.*;
public class collatz {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter write = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        int[] test;
        HashMap<Long, Integer> map;
        while((test = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray())[0] != 0) {
        	long a = test[0], b = test[1];
            int ca = 0, cb = 0;
            map = new HashMap<>();
            map.put(a, ca++);
            while(a != 1) {
            	if((a % 2) == 1)
            		a = 3 * a + 1;
            	else
            		a = a / 2;
            	if(!map.containsKey(a))
            		map.put(a, ca++);
            }
            while(!map.containsKey(b)) {
            	if((b % 2) == 1)
            		b = 3 * b + 1;
            	else
            		b = b / 2;
            	cb++;
            }
            write.println(test[0] + " needs " + map.get(b) + " steps, " + test[1] + " needs " + cb + " steps, they meet at " + b);
        }
        write.flush();
    }
}