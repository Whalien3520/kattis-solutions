import java.io.*;
import java.math.*;
import java.util.*;

public class trianglesofasquare {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] in = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if(in[0] == in[1] || in[0] + in[1] == 2024) {
            if(in[2] + in[0] == 2024 && in[3] + in[1] == 2024)
                System.out.println(0);
            else
                System.out.println(1);
        }
        else {
            if(in[2] == in[3] || in[2] + in[3] == 2024)
                System.out.println(1);
            else
                System.out.println(2);
        }
    }
}