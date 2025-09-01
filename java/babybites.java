import java.io.*;
import java.util.*;

public class babybites {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] a = br.readLine().split(" ");
        boolean flag = true;
        for(int i = 0; flag && i < a.length; i++)
            flag = a[i].equals("mumble") || Integer.parseInt(a[i]) == i + 1;
        System.out.println(flag ? "makes sense" : "something is fishy");
    }
}