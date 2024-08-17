import java.io.*;
public class quadrant {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(scan.readLine()), j = Integer.parseInt(scan.readLine());
		if(i > 0) {
			if(j > 0)
				System.out.println(1);
			else
				System.out.println(4);
		}
		else {
			if(j > 0)
				System.out.println(2);
			else
				System.out.println(3);
		}
	}
}
