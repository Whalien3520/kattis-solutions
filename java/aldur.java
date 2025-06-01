import java.io.*;
import java.util.*;

public class aldur {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
		while(n-- > 0) {
		    int t = Integer.parseInt(br.readLine());
		    min = t < min ? t : min;
		}
		System.out.println(min);
	}
}