import java.io.*;
import java.util.*;

public class lvable {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    br.readLine();
	    String s = br.readLine();
	    if(s.indexOf("lv") > -1) {
	        System.out.println(0);
	        return;
	    }
	    boolean l = s.indexOf('l') > -1, v = s.indexOf('v') > -1;
	    System.out.println((l || v) ? 1 : 2);
	}
}