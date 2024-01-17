import java.io.*;
import java.util.Arrays;
public class itsabouttime {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int[] rsh = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double fracOne = (2.0 * Math.PI * rsh[0] / rsh[1] / rsh[2]) % 1;
        //double fracOne = 0.0;
        if(fracOne > 0.5)
        	fracOne = 1 - fracOne;
        int[] ret = new int[3];
        double diff = 1;
        for(int a = 2; a <= 250; a++) {
        	for(int b = 2 * a; b <= 500; b += a) {
        		for(int c = 2 * b; c <= 1000; c += b) {
        			if(Math.abs(fracOne - (1.0 / a - 1.0 / b + 1.0 / c)) < diff) {
        				ret[0] = a;
        				ret[1] = b;
        				ret[2] = c;
        				diff = Math.abs(fracOne - (1.0 / a - 1.0 / b + 1.0 / c));
        			}
        		}
        	}
        }
        System.out.println(ret[0] + " " + ret[1] + " " + ret[2]);
    }
    
}