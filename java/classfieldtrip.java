import java.io.*;
public class classfieldtrip {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String a = scan.readLine(), b = scan.readLine();
		int[] arr = new int[26];
		for(int i = 0; i < a.length(); i++)
			arr[a.charAt(i) - 'a']++;
		for(int i = 0; i < b.length(); i++)
			arr[b.charAt(i) - 'a']++;
		char p = 'a';
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < arr[i]; j++)
				System.out.print(p);
			p++;
		}
	}
}
