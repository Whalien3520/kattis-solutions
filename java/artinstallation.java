import java.io.*;
import java.util.*;

public class artinstallation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] needs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), owns = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), buy = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i < 3; i++)
            needs[i] = Math.max(0, needs[i] - owns[i]);
        buy[0] -= needs[0];
        buy[1] -= needs[2];
        System.out.println((buy[0] < 0 || buy[1] < 0 || buy[0] + buy[1] < needs[1]) ? -1 : needs[0] + needs[1] + needs[2]);
    }
}