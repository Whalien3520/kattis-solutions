import java.io.*;
import java.util.*;

public class keysphonewallet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> s = new HashSet<>();
        while(N-- > 0)
            s.add(br.readLine());
        boolean flag = true;
        if(!s.contains("keys")) {
            flag = false;
            System.out.println("keys");
        }
        if(!s.contains("phone")) {
            flag = false;
            System.out.println("phone");
        }
        if(!s.contains("wallet")) {
            flag = false;
            System.out.println("wallet");
        }
        if(flag)
            System.out.println("ready");
    }
}