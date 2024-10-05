import java.io.*;
import java.math.*;
import java.util.*;

public class tarifa
{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(r.readLine()), N = Integer.parseInt(r.readLine());
        X *= N + 1;
        while(N-- > 0)
            X -= Integer.parseInt(r.readLine());
        System.out.println(X);
    }
}