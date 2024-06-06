import java.io.*;
import java.util.*;
public class barcelona {
    public static void main(String[] args) throws IOException {
        Scanner r = new Scanner(System.in);
        int n = r.nextInt();
        int k = r.nextInt();
        int i = 0;
        while(i++ < n)
            if(r.nextInt() == k)
                break;
        if(i == 1)
            System.out.println("fyrst");
        else if(i == 2)
            System.out.println("naestfyrst");
        else
            System.out.println(i + " fyrst");
    }
}