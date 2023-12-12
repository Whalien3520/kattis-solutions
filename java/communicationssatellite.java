import java.io.*;
import java.util.*;
public class communicationssatellite {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(scan.readLine());
		ArrayList<Dish> list = new ArrayList<>();
		while(N-- > 0) {
			String[] arr = scan.readLine().split(" ");
			Dish d = new Dish(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
			list.add(d);
		}
		double sum = 0.0;
		//can always take an arbitrary dish for minimum spanning tree
		Dish cur = list.remove(0);
		while(!list.isEmpty()) {
			for(Dish d : list)
				d.updateKey(cur);
			Collections.sort(list);
			cur = list.remove(0);
			sum += cur.key;
		}
		System.out.println(sum);
	}
	static class Dish implements Comparable<Dish>{
		int x, y, r;
		double key;
		public Dish(int a, int b, int c){
			x = a;
			y = b;
			r = c;
			key = Double.POSITIVE_INFINITY;
		}
		public void updateKey(Dish d) {
			key = Math.min(Math.sqrt(Math.pow(x - d.x, 2) + Math.pow(y - d.y, 2)) - r - d.r, key);
		}
		public int compareTo(Dish d) {
			if(this.key > d.key)
				return 1;
			else if(this.key < d.key)
				return -1;
			else
				return 0;
		}
	}
}
