import java.io.*;
import java.math.*;
import java.util.*;

public class kikiboba
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		char[] s = r.readLine().toCharArray();
		int b = 0, k = 0;
		for(char c : s) {
		    if(c == 'b')
		        b++;
		    else if(c == 'k')
		        k++;
		}
		if(b == k) {
		    if(b == 0)
		        System.out.println("none");
		    else
		        System.out.println("boki");
		}
		else {
		    if(b > k)
		        System.out.println("boba");
		    else
		        System.out.println("kiki");
		    
		}
	}
}