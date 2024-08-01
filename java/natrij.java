import java.io.*;
import java.util.*;
public class natrij {
    public static void main(String args[]) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] cur = Arrays.stream(r.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int[] exp = Arrays.stream(r.readLine().split(":")).mapToInt(Integer::parseInt).toArray();
        int curS = cur[0] * 3600 + cur[1] * 60 + cur[2], expS = exp[0] * 3600 + exp[1] * 60 + exp[2];
        
        if(expS <= curS)
            expS += 24 * 3600;
        expS -= curS;
        
        int h = expS / 3600;
        expS -= h * 3600;
        if(h >= 10)
            System.out.print(h + ":");
        else
            System.out.print("0" + h + ":");

        int m = expS / 60;
        expS -= m * 60;
        if(m >= 10)
            System.out.print(m + ":");
        else
            System.out.print("0" + m + ":");

        if(expS >= 10)
            System.out.println(expS);
        else
            System.out.println("0" + expS);
    }
}