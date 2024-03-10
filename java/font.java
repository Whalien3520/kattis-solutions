import java.io.*;
import java.util.*;
public class font {
    static int[] iarr;
    static int ret;
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(scan.readLine());
        iarr = new int[N];
        Arrays.fill(iarr, 0);
        while(--N >= 0) {
        	//System.out.println(N);
        	char[] carr = scan.readLine().toCharArray();
        	for(char c : carr)
        		iarr[N] |= 1 << (c - 'a');
        }
        for(int i = 0; i < iarr.length; i++)
        	rec(0, i);
        System.out.println(ret);
    }
    //recurse on current bitwise OR of numbers and index recursed upon
    public static void rec(int or, int i) {
    	or |= iarr[i];
    	if(or == 67108863)
    		ret += (int) Math.pow(2, iarr.length - i - 1);
    	else
    		for(int j = i + 1; j < iarr.length; j++)
    			rec(or, j);
    }
}