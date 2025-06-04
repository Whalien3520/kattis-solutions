import java.io.*;
import java.util.*;

public class ofugsnuid {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    int[] a = new int[n];
	    while(n-- > 0)
	        a[n] = Integer.parseInt(br.readLine());
	    for(int i = 0; i < a.length; i++)
	        System.out.println(a[i]);
	}
}