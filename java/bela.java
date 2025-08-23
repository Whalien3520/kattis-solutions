import java.io.*;
import java.util.*;

public class bela {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] d = new int[] {11, 4, 3, 20, 10, 14, 0, 0}, s = new int[] {11, 4, 3, 2, 10, 0, 0, 0};
        String o = "AKQJT987";
        String[] a = br.readLine().split(" ");
        int ret = 0;
        for(int i = 0; i < Integer.parseInt(a[0]) * 4; i++) {
            char[] c = br.readLine().toCharArray();
            ret += (a[1].indexOf(c[1]) > -1 ? d : s)[o.indexOf(c[0])]; 
        }
        System.out.println(ret);
    }
}