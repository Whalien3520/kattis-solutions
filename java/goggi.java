import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int i = s.indexOf('?'), a = Integer.parseInt(s.substring(0, i - 1)), b = Integer.parseInt(s.substring(i + 2));
		System.out.println(a == b ? "Goggi svangur!" : (a < b ? '<' : '>'));
	}
}