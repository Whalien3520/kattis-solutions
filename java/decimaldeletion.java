import java.io.*;
import java.math.*;
import java.util.*;

public class decimaldeletion
{
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(r.readLine());
        System.out.println(Math.round(d));
    }
}