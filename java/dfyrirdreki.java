import java.io.*;
import java.util.*;

public class dfyrirdreki {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
	    b = b * b - 4 * a * c;
	    System.out.println(b > 0 ? 2 : (b < 0 ? 0 : 1));
	}
}