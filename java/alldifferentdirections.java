import java.io.*;
import java.util.*;
public class alldifferentdirections {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while((n = Integer.parseInt(scan.readLine())) != 0) {
			ArrayList<double[]> coords = new ArrayList<>();
			while(n-- > 0) {
				String[] arr = scan.readLine().split(" ");
				double[] cur = new double[2];
				cur[0] = Double.parseDouble(arr[0]);
				cur[1] = Double.parseDouble(arr[1]);
				if(arr.length < 4) {
					System.out.println("no start angle was given");
					System.exit(1);
				}
				double angle = Double.parseDouble(arr[3]);
				for(int i = 4; i < arr.length; i += 2) {
					double mag = Double.parseDouble(arr[i + 1]);
					if(arr[i].equals("turn"))
						angle += mag;
					else {
						cur[0] += mag * Math.cos(Math.toRadians(angle));
						cur[1] += mag * Math.sin(Math.toRadians(angle));
					}
				}
				coords.add(cur);
			}
			
			double retx = 0;
			double rety = 0;
			for(double[] coord : coords) {
				retx += coord[0];
				rety += coord[1];
			}
			retx /= coords.size();
			rety /= coords.size();
			
			double worst = 0;
			for(double[] coord : coords) {
				double diffx = coord[0] - retx;
				double diffy = coord[1] - rety;
				double dist = Math.sqrt(diffx * diffx + diffy * diffy);
				worst = Math.max(worst, dist);
			}
			System.out.println(String.format("%.4f %.4f %.4f", retx, rety, worst));
		}
		scan.close();
	}
}
