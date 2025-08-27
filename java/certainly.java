import java.io.*;
import java.util.*;

public class certainly {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int ret = -1, p = -1;
        do {
            ret++;
            p = s.indexOf("certainly", p + 1);
        } while(p > -1);
        System.out.println(ret);
    }
}