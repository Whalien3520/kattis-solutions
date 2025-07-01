import java.io.*;
import java.util.*;

public class grafaholur {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nhxmy = new int[5];
        for(int i = 0; i < 5; i++)
            nhxmy[i] = Integer.parseInt(br.readLine());
        System.out.println(((double)nhxmy[4] / nhxmy[3]) / ((double)nhxmy[2] / nhxmy[1] / nhxmy[0]));
    }
}