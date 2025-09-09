import java.io.*;
import java.util.*;

public class goatrope {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(a[0] < a[2]) {
            if(a[1] < a[3])
                System.out.println(Math.sqrt(Math.pow(a[2] - a[0], 2) + Math.pow(a[3] - a[1], 2)));
            else if(a[1] > a[5])
                System.out.println(Math.sqrt(Math.pow(a[2] - a[0], 2) + Math.pow(a[1] - a[5], 2)));
            else
                System.out.println(a[2] - a[0]);
        }
        else if(a[0] > a[4]) {
            if(a[1] < a[3])
                System.out.println(Math.sqrt(Math.pow(a[0] - a[4], 2) + Math.pow(a[3] - a[1], 2)));
            else if(a[1] > a[5])
                System.out.println(Math.sqrt(Math.pow(a[0] - a[4], 2) + Math.pow(a[1] - a[5], 2)));
            else
                System.out.println(a[0] - a[4]);
        }
        else {
            if(a[1] < a[3])
                System.out.println(a[3] - a[1]);
            else
                System.out.println(a[1] - a[5]);
        }
    }
}