import java.io.*;
public class countthevowels {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String s = scan.readLine().toLowerCase();
		String vowels = "aeiou";
		int ret = 0;
		for(int i = 0; i < s.length(); i++)
			if(vowels.indexOf(s.charAt(i)) != -1)
				ret++;
		System.out.println(ret);
	}
}
