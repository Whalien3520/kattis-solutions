import java.io.*;
import java.math.*;
import java.util.*;

public class isithalloween
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String s = r.readLine();
	    System.out.println((s.equals("OCT 31") || s.equals("DEC 25")) ? "yup" : "nope");
	}
}