import java.io.*;
import java.util.*;

public class licensetolaunch {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] r = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int ret = 0;
        for(int i = 1; i < r.length; i++)
            if(r[i] < r[ret])
                ret = i;
        System.out.println(ret);
    }
}