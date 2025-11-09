import java.io.*;
import java.math.*;
import java.util.*;

public class fallingleaves {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        while(!s.equals("$")) {
            if(s.equals("*")) {
                s = br.readLine();
                bw.newLine();
                continue;
            }
            List<char[]> l = new ArrayList<>();
            while(!(s.equals("*") || s.equals("$"))) {
                l.add(s.toCharArray());
                s = br.readLine();
            }
            Node root = new Node(l.get(l.size() - 1)[0]);
            for(int i = l.size() - 2; i >= 0; i--)
                for(char c : l.get(i)) {
                    Node cur = root, prev = null;
                    while(cur != null) {
                        prev = cur;
                        cur = c < cur.c ? cur.l : cur.r;
                    }
                    if(c < prev.c)
                        prev.l = new Node(c);
                    else
                        prev.r = new Node(c);
                }
            Node[] a = new Node[26];
            int i = 0;
            a[i] = root;
            while(i >= 0) {
                Node cur = a[i--];
                bw.write(String.format("%c", cur.c));
                if(cur.r != null)
                    a[++i] = cur.r;
                if(cur.l != null)
                    a[++i] = cur.l;
            }
        }
        bw.flush();
    }
    static class Node {
        char c;
        Node l, r;
        public Node(char ch) {
            c = ch;
        }
    }
}