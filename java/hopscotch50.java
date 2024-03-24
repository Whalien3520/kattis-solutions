import java.io.*;
import java.util.*;
public class hopscotch50 {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nk = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		//tabulates art by tile number
		ArrayList<ArrayList<Node>> list = new ArrayList<>();
		for(int i = 0; i < nk[1]; i++)
			list.add(new ArrayList<>());
		for(int r = 0; r < nk[0]; r++) {
			int[] temp = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for(int c = 0; c < nk[0]; c++)
				list.get(temp[c] - 1).add(new Node(r, c, Integer.MAX_VALUE));
		}
		//if any number has no tiles, print -1 and leave
		for(ArrayList<Node> l : list)
			if(l.size() == 0) {
				System.out.println(-1);
				return;
			}
		//set all tiles numbered 1 to have dist 0
		for(int t = 0; t < list.get(0).size(); t++)
			list.get(0).get(t).d = 0;
		//iterate through almost all tiles
		for(int t = 0; t < nk[1] - 1; t++) {
			//iterate through the tiles numbered current iteration
			for(int l = 0; l < list.get(t).size(); l++) {
				//iterate through tiles numbered 1 greater
				for(int h = 0; h < list.get(t + 1).size(); h++) {
					list.get(t + 1).get(h).d = Math.min(list.get(t + 1).get(h).d, list.get(t).get(l).d
							+ Math.abs(list.get(t).get(l).x - list.get(t + 1).get(h).x)
							+ Math.abs(list.get(t).get(l).y - list.get(t + 1).get(h).y));
				}
			}
		}
		list.get(nk[1] - 1).sort((a, b) -> a.d - b.d);
		System.out.println(list.get(nk[1] - 1).get(0).d);
	}
	static class Node {
		int x,y,d;
		public Node(int a, int b, int c) {
			x = a;
			y = b;
			d = c;
		}
	}
}
