import java.io.*;
import java.util.*;
public class curvyblocks {
	public static double[] y, d, d2, d0;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s = scan.readLine()) != null) {
			double[] b = Arrays.stream(s.split(" ")).mapToDouble(Double::parseDouble).toArray();
			double[] t = Arrays.stream(scan.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
			for(int i = 0; i < 4; i++)
				y[i] = t[i] - b[i];
			
			calc();
			double min = min();
			if(min != 0) {
				y[0] -= min;
				calc();
			}
			
			System.out.println(max());
		}
	}
	public static void calc() {
		d = new double[3];
		d2 = new double[2];
		d0 = new double[2];
		for(int i = 0; i < 3; i++)
			d[i] = (i + 1) * y[i + 1];
		for(int i = 0; i < 2; i++)
			d2[i] = (i + 1) * d[i + 1];
		
		double det = Math.sqrt(d[1] * d[1] - 4 * d[0] * d[2]);
		d0[0] = (0 - d[1] + det) / (2 * d[2]);
		d0[1] = (0 - d[1] - det) / (2 * d[2]);
	}
	public static double max() {
		double ret = Math.max(eval(y, 0), eval(y, 1));;
		if(0 < d0[0] && d0[0] < 1 && eval(d2, d0[0]) < 0)
			ret = Math.max(ret, eval(y, d0[0]));
		if(0 < d0[1] && d0[1] < 1 && eval(d2, d0[1]) < 0)
			ret = Math.max(ret, eval(y, d0[1]));
		return ret;
	}
	public static double min() {
		double ret = Math.min(eval(y, 0), eval(y, 1));
		if(0 < d0[0] && d0[0] < 1 && eval(d2, d0[0]) > 0)
			ret = Math.min(ret, eval(y, d0[0]));
		if(0 < d0[1] && d0[1] < 1 && eval(d2, d0[1]) > 0)
			ret = Math.min(ret, eval(y, d0[1]));
		return ret;
	}
	public static double eval(double[] p, double x) {
		double ret = 0;
		for(int i = 0; i < p.length; i++)
			ret += Math.pow(x, i) * p[i];
		return ret;
	}
}
