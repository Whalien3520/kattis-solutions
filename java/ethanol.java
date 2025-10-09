import java.io.*;
import java.util.*;

public class ethanol {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());
        StringBuilder h = new StringBuilder("  "), b = new StringBuilder("  ");
        for(int i = 0; i < c; i++) {
            h.append("H ");
            b.append("| ");
        }
        System.out.println(h.toString());
        System.out.println(b.toString());
        System.out.print("H-");
        for(int i = 0; i < c; i++)
            System.out.print("C-");
        System.out.println("OH");
        System.out.println(b.toString());
        System.out.println(h.toString());
    }
}