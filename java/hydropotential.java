import java.io.*;
import java.util.*;

public class hydropotential {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 3; i++)
            System.out.println(10 * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()));
    }
}