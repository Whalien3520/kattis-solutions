import java.io.*;
import java.util.*;

public class avion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean ret = true;
        for(int i = 1; i <= 5; i++) {
            String s = br.readLine();
            if(s.indexOf("FBI") > -1) {
                System.out.println(i);
                ret = false;
            }
        }
        if(ret)
            System.out.println("HE GOT AWAY!");
    }
}