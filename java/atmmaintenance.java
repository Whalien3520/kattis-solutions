import java.io.*;
import java.util.*;

public class atmmaintenance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] NK = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i : A) {
            if(i <= NK[1]) {
                NK[1] -= i;
                System.out.print(1);
            }
            else
                System.out.print(0);
        }
    }
}