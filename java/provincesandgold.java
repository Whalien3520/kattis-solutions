import java.io.*;
import java.math.*;
import java.util.*;

public class provincesandgold
{
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int[] GSC = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int w = 3 * GSC[0] + 2 * GSC[1] + GSC[2];
		if(w >= 2)
		    System.out.print(w >= 8 ? "Province or " : (w >= 5 ? "Duchy or " : "Estate or "));
		System.out.print(w >= 6 ? "Gold" : (w >= 3 ? "Silver" : "Copper"));
	}
}