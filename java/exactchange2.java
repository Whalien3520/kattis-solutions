import java.io.*;
import java.util.*;
public class exactchange2 {
	static int minSum, minCount;
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(scan.readLine());
        while(t > 0) {
            int p = Integer.parseInt(scan.readLine()), n = Integer.parseInt(scan.readLine());
            int[] arr = new int[10001];
            Arrays.fill(arr, 101);
            arr[0] = 0;
            while(n > 0) {
            	int[] temp = Arrays.copyOf(arr, 10001);
            	int c = Integer.parseInt(scan.readLine());
            	for(int i = c; i < 10001; i++) {
            		
            		temp[i] = Math.min(arr[i], arr[i-c] + 1);
            	}
            	temp[c] = 1;
            	arr = temp;
            	/*for(int i = 0; i < 10001; i++)
            		if(arr[i] < 101)
            			System.out.print(i + " " + arr[i] + ", ");
            	System.out.println();*/
            	n--;
            }
            for(int i = p; i < 10001; i++) {
            	if(arr[i] < 101) {
            		System.out.println(i + " " + arr[i]);
            		break;
            	}
            }
            t--;
        }
    }
}