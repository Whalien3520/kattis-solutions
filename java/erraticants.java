import java.util.*;
import java.io.*;
public class erraticants {
    public static void main(String args[]) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scan.readLine());
        while(n-- > 0) {
            scan.readLine();
            int s = Integer.parseInt(scan.readLine()), r = 65, c = 65, count = s;
            Node[][] map = new Node[130][130];
            for(int i = 0; i < 130; i++)
                for(int j = 0; j < 130; j++)
                	map[i][j] = new Node(Integer.MAX_VALUE);
                    
            while(count-- > 0) {
                String str = scan.readLine();
                if(str.equals("N")) {
                    map[r--][c].N = true;
                    map[r][c].S = true;
                }
                else if(str.equals("S")) {
                    map[r++][c].S = true;
                    map[r][c].N = true;
                }
                else if(str.equals("E")) {
                    map[r][c++].E = true;
                    map[r][c].W = true;
                }
                else if(str.equals("W")) {
                    map[r][c--].W = true;
                    map[r][c].E = true;
                }
            }
            
            Queue<Pair> q = new LinkedList<>();
            q.add(new Pair(65, 65));
            map[65][65].dist = 0;
            while(!q.isEmpty()) {
                Pair p = q.poll();
                int k = p.k, v = p.v;
                Node nod = map[k][v];
                if(nod.N && nod.dist + 1 < map[k - 1][v].dist) {
                    map[k - 1][v].dist = nod.dist + 1;
                    q.add(new Pair(k - 1, v));
                }
                if(nod.S && nod.dist + 1 < map[k + 1][v].dist) {
                    map[k + 1][v].dist = nod.dist + 1;
                    q.add(new Pair(k + 1, v));
                }
                if(nod.E && nod.dist + 1 < map[k][v + 1].dist) {
                    map[k][v + 1].dist = nod.dist + 1;
                    q.add(new Pair(k, v + 1));
                }
                if(nod.W && nod.dist + 1 < map[k][v - 1].dist) {
                    map[k][v - 1].dist = nod.dist + 1;
                    q.add(new Pair(k, v - 1));
                }
            }
            System.out.println(map[r][c].dist);
        }
    }
    static class Node {
        boolean N, S, E, W;
        int dist;
        public Node (int i) {
        	dist = i;
        }
    }
    static class Pair {
        int k, v;
        public Pair(int a, int b) {
            k = a;
            v = b;
        }
    }
}