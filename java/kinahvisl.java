import java.io.*;
import java.util.*;

public class kinahvisl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine(), b = br.readLine();
        int ret = 1;
        for(int i = 0; i < a.length(); i++)
            if(a.charAt(i) != b.charAt(i))
                ret++;
        System.out.println(ret);
    }
}