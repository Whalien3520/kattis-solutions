import java.io.*;
import java.math.*;
import java.util.*;

public class helpme {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static String p = "KQRBNP";
    public static void main(String[] args) throws IOException {
        List<char[]> w = new ArrayList<>(), k = new ArrayList<>();
        for(int i = 7; i >= 0; i--) {
            br.readLine();
            char[] s = br.readLine().toCharArray();
            for(int j = 0; j < 8; j++)
                if(Character.isLetter(s[2 + 4 * j]))
                    (Character.isUpperCase(s[2 + 4 * j]) ? w : k).add(new char[] {Character.toUpperCase(s[2 + 4 * j]), (char)('a' + j), (char)('1' + i)});
        }
        Collections.sort(w, (a, b) -> a[0] != b[0] ? Integer.compare(p.indexOf(a[0]), p.indexOf(Character.toUpperCase(b[0]))) : a[2] != b[2] ? Character.compare(a[2], b[2]) : Character.compare(a[1], b[1]));
        Collections.sort(k, (a, b) -> a[0] != b[0] ? Integer.compare(p.indexOf(a[0]), p.indexOf(Character.toUpperCase(b[0]))) : a[2] != b[2] ? Character.compare(b[2], a[2]) : Character.compare(a[1], b[1]));
        bw.write("White: ");
        StringBuilder ret = new StringBuilder();
        for(char[] c : w)
            ret.append((c[0] != 'P' ? c[0] : "") + "" + c[1] + "" + c[2] + ",");
        if(w.size() >= 1)
            ret.deleteCharAt(ret.length() - 1);
        bw.write(ret.toString() + "\nBlack: ");
        ret = new StringBuilder();
        for(char[] c : k)
            ret.append((c[0] != 'P' ? c[0] : "") + "" + c[1] + "" + c[2] + ",");
        if(k.size() >= 1)
            ret.deleteCharAt(ret.length() - 1);
        bw.write(ret.toString() + "\n");
        bw.flush();
    }
}