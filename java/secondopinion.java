import java.io.*;
import java.util.*;

public class secondopinion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        System.out.println((s / 3600) + " : " + ((s % 3600) / 60) + " : "  + (s % 60));
    }
}