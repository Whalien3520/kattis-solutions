import java.io.*;
import java.util.*;
public class anthonyanddiablo {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		double[] AN = Arrays.stream(scan.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
		double rad = AN[1] / Math.PI / 2;
		double area = rad * rad * Math.PI;
		System.out.println(area >= AN[0] ? "Diablo is happy!" : "Need more materials!");
		scan.close();
	}
}
