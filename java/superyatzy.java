import java.io.*;
import java.util.*;
public class superyatzy {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] NM = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] count = new int[7];
        while(NM[0]-- > 0)
            count[Integer.parseInt(r.readLine())]++;
        int sum = 0;
        for(int i = 1; i < 7; i++)
            sum += count[i];
        for(int i = 1; i < 7; i++)
            if(sum - count[i] <= NM[1]) {
                System.out.println("Ja");
                return;
            }
        System.out.println("Nej");
    }
}