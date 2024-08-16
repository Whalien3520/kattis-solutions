import java.io.*;
import java.util.*;
public class progressivescramble {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		while(n-- > 0) {
			String s = scan.readLine();
			boolean encrypt = s.charAt(0) == 'e';
			s = s.substring(2);
			if(encrypt)
				encrypt(s);
			else
				decrypt(s);
		}
	}
	public static void encrypt(String s) {
		int[] v = new int[s.length()];
		//System.out.println(s + " " + s.length());
		for(int i = 0; i < v.length; i++) {
			if(s.charAt(i) == ' ')
				v[i] = 0;
			else if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
				v[i] = s.charAt(i) - 'a' + 1;
			else {
				System.out.println("bad character at encrypt loop v");
				System.exit(1);
			}
		}
		
		int[] u = new int[v.length];
		u[0] = v[0];
		for(int i = 1; i < v.length; i++)
			u[i] = (u[i - 1] + v[i]) % 27;
		
		for(int i = 0; i < u.length; i++) {
			if(u[i] == 0)
				System.out.print(' ');
			else if(1 <= u[i] && u[i] <= 26)
				System.out.print((char)('a' + u[i] - 1));
			else {
				System.out.println("bad character at encrypt loop u");
				System.exit(1);
			}
		}
		System.out.println();
	}
	public static void decrypt(String s) {
		int[] u = new int[s.length()];
		for(int i = 0; i < u.length; i++) {
			if(s.charAt(i) == ' ')
				u[i] = 0;
			else if('a' <= s.charAt(i) && s.charAt(i) <= 'z')
				u[i] = s.charAt(i) - 'a' + 1;
			else {
				System.out.println("bad character at decrypt loop u");
				System.exit(1);
			}
		}
		
		int[] v = new int[u.length];
		for(int i = v.length - 1; i > 0; i--)
			v[i] = (u[i] + 27 - u[i - 1]) % 27;
		v[0] = u[0];
		
		for(int i = 0; i < v.length; i++) {
			if(v[i] == 0)
				System.out.print(' ');
			else if(1 <= v[i] && v[i] <= 26)
				System.out.print((char)('a' + v[i] - 1));
			else {
				System.out.println("bad character at decrypt loop v");
				System.exit(1);
			}
		}
		System.out.println();
	}
}
