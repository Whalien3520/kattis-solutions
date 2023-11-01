import java.io.*;
public class averagespeed {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int sec = 0, spd = 0;
		double dist = 0;
		String line;
		while((line = scan.readLine()) != null) {
			String[] arr = line.split(" "), time = arr[0].split(":");
			int tempSec = Integer.parseInt(time[0]) * 3600
						+ Integer.parseInt(time[1]) * 60
						+ Integer.parseInt(time[2]);
			if(arr.length == 1)
				System.out.println(arr[0] + String.format(" %.2f km", dist + (tempSec - sec) / 3600.0 * spd));
			else {
				dist += (tempSec - sec) / 3600.0 * spd;
				sec = tempSec;
				spd = Integer.parseInt(arr[1]);
			}
		}
	}
}
