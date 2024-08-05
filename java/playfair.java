import java.io.*;
import java.util.*;
public class playfair {
	static char[][] tab = new char[5][5];
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		setTab(scan.readLine());
		String s = scan.readLine().toUpperCase();
		int i = 0;
		while(i < s.length()) {
			while(i < s.length() && s.charAt(i) == ' ')
				i++;
			char cur = s.charAt(i);
			int j = i + 1;
			while(j < s.length() && s.charAt(j) == ' ')
				j++;
			if(j == s.length() || s.charAt(j) == cur) {
				enc(cur, 'X');
				j--;
			}
			else
				enc(cur, s.charAt(j));
			i = j + 1;
		}
		scan.close();
	}
	public static void setTab(String key) {
		int ind = 0;
		String s = "ABCDEFGHIJKLMNOPRSTUVWXYZ";
		for(char c : key.toUpperCase().toCharArray()) {
			int i = s.indexOf(c);
			if(i > -1) {
				s = s.substring(0, i) + s.substring(i + 1);
				tab[ind / 5][ind % 5] = c;
				ind++;
			}
		}
		for(char c : s.toCharArray()) {
			tab[ind / 5][ind % 5] = c;
			ind++;
		}
	}
	public static void enc(char a, char b) {
		int rowA = -1, rowB = -1, colA = -1, colB = -1;
		for(int r = 0; r < 5; r++)
			for(int c = 0; c < 5; c++) {
				if(tab[r][c] == a) {
					rowA = r;
					colA = c;
				}
				else if(tab[r][c] == b) {
					rowB = r;
					colB = c;
				}
			}
		if(rowA == -1 || rowB == -1 || colA == -1 || colB == -1) {
			System.out.println("letter not found while encrypting");
			System.exit(1);
		}
		if(rowA == rowB) {
			System.out.print(tab[rowA][(colA + 1) % 5]);
			System.out.print(tab[rowB][(colB + 1) % 5]);
			return;
		}
		if(colA == colB) {
			System.out.print(tab[(rowA + 1) % 5][colA]);
			System.out.print(tab[(rowB + 1) % 5][colB]);
			return;
		}
		System.out.print(tab[rowA][colB]);
		System.out.print(tab[rowB][colA]);
	}
}