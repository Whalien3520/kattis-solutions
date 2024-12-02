import java.io.*;
import java.util.*;
public class reduplikation {
	public static void main(String[] args) throws IOException {
		Scanner c = new Scanner(System.in);
		String s = c.next();
		int a = c.nextInt();
		for(int i = 0; i < a; i++)
			System.out.print(s);
		c.close();
	}
}
