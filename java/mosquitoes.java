import java.util.*;
import java.io.*;
public class mosquitoes {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(scan.readLine());
		while(n-- > 0) {
			scan.readLine();
			String[] lineCase = scan.readLine().split(" ");
			int mosquitoes = Integer.parseInt(lineCase[0]);
			double radius = Double.parseDouble(lineCase[1]) / 2;
			double[][] coords = new double[mosquitoes][2];
			while(--mosquitoes > -1)
				coords[coords.length - mosquitoes - 1] = Arrays.stream(scan.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
			
			int ret = 1;
			for(int i = 0; i < coords.length - 1; i++) {
				for(int j = i + 1; j < coords.length; j++) {
					//System.out.println("\n" + coords[i][0] + " " + coords[i][1] + " " + coords[j][0] + " " + coords[j][1]);
					
					if(dist(coords[i], coords[j]) > radius * 2 + 1e-9)
						continue;
					double[][] pts = points(coords[i], coords[j], radius);
					//for(double[] pt : pts)
						//System.out.print(pt[0] + " " + pt[1] + "\t");
					//System.out.println();
					for(double[] pt : pts) {
						int count = 0;
						for(double[] coord : coords) {
							if(dist(coord, pt) <= radius + 1e-9)
								count++;
						}
						ret = Math.max(ret, count);
					}
				}
			}
			System.out.println(ret);
		}
	}
	public static double dist(double[] i, double[] j) {
		double x = i[0] - j[0];
		double y = i[1] - j[1];
		return Math.sqrt(x*x + y*y);
	}
	public static double[][] points(double[] i, double[] j, double radius) {
		double[] mid = {(i[0] + j[0]) / 2, (i[1] + j[1]) / 2};
		double halfDist = dist(i, j) / 2;
		double lensquare = radius * radius - halfDist * halfDist;
		if(lensquare < 1e-9){
			double[][] ret = new double[1][2];
			ret[0] = mid;
			return ret;
		}
		
		double[] vec = {j[1] - i[1], j[0] - i[0]};
		double mag = Math.sqrt(vec[0] * vec[0] + vec[1] * vec[1]);
		vec[0] /= mag;
		vec[1] /= mag;
		double len = Math.sqrt(lensquare);
		vec[0] *= len;
		vec[1] *= len;
		
		double[][] ret = new double[2][2];
		ret[0][0] = mid[0] + vec[0];
		ret[0][1] = mid[1] - vec[1];
		ret[1][0] = mid[0] - vec[0];
		ret[1][1] = mid[1] + vec[1];
		return ret;
		
	}
}
