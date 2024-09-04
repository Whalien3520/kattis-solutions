import java.io.*;
import java.math.*;
import java.util.*;

public class blandadbest
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		if(Integer.parseInt(r.readLine()) > 1)
		    System.out.println("blandad best");
		else
		    System.out.println(r.readLine());
	}
}