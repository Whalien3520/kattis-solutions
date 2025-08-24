import java.io.*;
import java.util.*;

public class hvertskalmaeta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.equals("Akureyri") || s.equals("Fjardabyggd") || s.equals("Mulathing"))
            System.out.println("Akureyri");
        else
            System.out.println("Reykjavik");
    }
}