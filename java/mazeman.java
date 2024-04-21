import java.io.*;
import java.util.*;
public class mazeman {
	static char[][] map;
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] in = scan.readLine().split(" ");
		int n = Integer.parseInt(in[0]), m = Integer.parseInt(in[1]), i = 0, dots = 0, ents = 0;
		map = new char[n][m];
		while(i < n)
			map[i++] = scan.readLine().toCharArray();
		for(i = 0; i < n; i++) {
			if(map[i][0] != 'X')
				if(rec(i, 1) > 0)
					ents++;
			if(map[i][m - 1] != 'X')
				if(rec(i, m - 2) > 0)
					ents++;
		}
		for(i = 1; i < m - 1; i++) {
			if(map[0][i] != 'X')
				if(rec(1, i) > 0)
					ents++;
			if(map[n - 1][i] != 'X')
				if(rec(n - 2, i) > 0)
					ents++;
			
		}
		for(char[] r : map)
			for(char c : r)
				if(c == '.')
					dots++;
		System.out.println(ents + " " + dots);
	}
	private static int rec(int a, int b) {
		LinkedList<Pair> q = new LinkedList<>();
		q.add(new Pair(a, b));
		int ret = 0;
		while(!q.isEmpty()) {
			Pair p = q.poll();
			if(map[p.a][p.b] != '.' && map[p.a][p.b] != ' ')
				continue;
			if(map[p.a][p.b] == '.')
				ret++;
			map[p.a][p.b] = 'X';
			if(p.a > 0)
				q.add(new Pair(p.a - 1, p.b));
			if(p.b > 0)
				q.add(new Pair(p.a, p.b - 1));
			if(p.a + 1 < map.length)
				q.add(new Pair(p.a + 1, p.b));
			if(p.b + 1 < map[0].length)
				q.add(new Pair(p.a, p.b + 1));
		}
		return ret;
	}
	static class Pair {
		int a, b;
		public Pair(int x, int y) {
			a = x;
			b = y;
		}
	}
}
