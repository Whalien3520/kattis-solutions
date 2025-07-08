import java.io.*;
import java.util.*;

public class undeadoralive {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String s = br.readLine();
	    boolean a = s.indexOf(":)") > -1, u = s.indexOf(":(") > -1;
	    System.out.println(a ? (u ? "double agent" : "alive") : (u ? "undead" : "machine"));
	}
}