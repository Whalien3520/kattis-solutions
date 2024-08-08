import java.io.*;
import java.math.*;
import java.util.*;

public class lastfactorialdigit
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(r.readLine());
	    int i = 1;
	    int[] ret = new int[10];
	    ret[0] = 1;
	    while(i++ < 10)
	        ret[i - 1] = (ret[i - 2] * i) % 10;
	    while(T-- > 0)
	        System.out.println(ret[Integer.parseInt(r.readLine()) - 1]);
	}
}