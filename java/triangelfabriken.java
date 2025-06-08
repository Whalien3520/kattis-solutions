import java.io.*;
import java.util.*;

public class triangelfabriken {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine()), c = Integer.parseInt(br.readLine());
        if(a > 90 || b > 90 || c > 90)
            System.out.println("Trubbig Triangel");
        else if(a == 90 || b == 90 || c == 90)
            System.out.println("Ratvinklig Triangel");
        else
            System.out.println("Spetsig Triangel");
    }
}