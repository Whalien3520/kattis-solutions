import java.io.*;
import java.math.*;
import java.util.*;

public class pokerhand
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	    String s = r.readLine(), comp = "A123456789TJQK";
	    int[] arr = new int[comp.length()];
	    for(int i = 0; i < 13; i += 3)
	        arr[comp.indexOf(s.charAt(i))]++;
	    int max = -1;
	    for(int i = 0; i < arr.length; i++)
	        max = Math.max(max, arr[i]);
	    System.out.println(max);
	}
}