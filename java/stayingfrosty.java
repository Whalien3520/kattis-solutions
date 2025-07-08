import java.io.*;
import java.util.*;

public class stayingfrosty {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int[] wp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    System.out.println((wp[1] * 180 * 2 >= wp[0]) ? "YES" : "NO");
	}
}