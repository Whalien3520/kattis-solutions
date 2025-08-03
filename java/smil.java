import java.io.*;
import java.util.*;

public class smil {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        for(int i = a.length - 1; i > 0; i--){
            if(a[i] != ')') 
                continue;
            if (a[i - 1] == ':' || a[i - 1] == ';') {
                System.out.println(i - 1);
                i--;
            }
            else if(a[i - 1] == '-' && i > 1 && (a[i - 2] == ':' || a[i - 2] == ';')) {
                System.out.println(i - 2);
                i -= 2;
            }
        }
    }
}