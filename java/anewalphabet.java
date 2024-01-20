import java.io.*;
public class anewalphabet {
	static String[] lookup = {"@",
			"8",
			"(",
			"|)",
			"3",
			"#",
			"6",
			"[-]",
			"|",
			"_|",
			"|<",
			"1",
			"[]\\/[]",
			"[]\\[]",
			"0",
			"|D",
			"(,)",
			"|Z",
			"$",
			"']['",
			"|_|",
			"\\/",
			"\\/\\/",
			"}{",
			"`/",
			"2"};
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String input = scan.readLine();
		for(char c : input.toCharArray()) {
			if('a' <= c && c <= 'z')
				System.out.print(lookup[c - 'a']);
			else if('A' <= c && c <= 'Z')
				System.out.print(lookup[c - 'A']);
			else
				System.out.print(c);
		}
	}
}
