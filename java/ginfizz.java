import java.io.*;
import java.util.*;

public class ginfizz {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int N = Integer.parseInt(br.readLine());
	    System.out.println((N * 45) + " ml gin");
	    System.out.println((N * 30) + " ml fresh lemon juice");
	    System.out.println((N * 10) + " ml simple syrup");
	    System.out.println(N + " " + (N == 1 ? "slice" : "slices") + " of lemon");
	}
}