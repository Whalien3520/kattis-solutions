import java.io.*;
import java.math.*;
import java.util.*;

public class fizzbuzz {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int[] XYN = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 1; i <= XYN[2]; i++) {
            if(i % XYN[0] == 0) {
                if(i % XYN[1] == 0)
                    System.out.println("FizzBuzz");
                else
                    System.out.println("Fizz");
            }
            else if(i % XYN[1] == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}