import java.io.*;
import java.util.*;

public class methodicmultiplication {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = br.readLine().length() / 3, ll = br.readLine().length() / 3;
        for(int i = 0; i < l * ll; i++)
            System.out.print("S(");
        System.out.print(0);
        for(int i = 0; i < l * ll; i++)
            System.out.print(")");
    }
}