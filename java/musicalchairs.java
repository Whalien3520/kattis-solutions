import java.io.*;
import java.math.*;
import java.util.*;

public class musicalchairs {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int[] k = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Node root = new Node(1, k[0]), cur = root;
        for(int i = 2; i <= n; i++) {
            cur.next = new Node(i, k[i - 1]);
            cur.next.prev = cur;
            cur = cur.next;
        }
        cur.next = root;
        root.prev = cur;
        while(n > 1) {
            int i = cur.next.op % n--;
            while(i-- > 0)
                cur = cur.next;
            cur.prev.next = cur.next;
            cur.next.prev = cur.prev;
            cur = cur.prev;
        }
        System.out.println(cur.num);
    }
    static class Node {
        int num, op;
        Node next, prev;
        public Node(int n, int o) {
            num = n;
            op = o;
        }
    }
}