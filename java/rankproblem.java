import java.io.*;
import java.util.*;
import java.util.regex.*;
public class rankproblem {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int[] nm = Arrays.stream(scan.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int[] arr = new int[nm[0]];
		for(int i = 0; i < nm[0]; i++) {
			arr[i] = i + 1;
			map.put(i + 1, i);
		}
		
		Pattern pat = Pattern.compile("T(\\d*) T(\\d*)");
		while(nm[1]-- > 0) {
			String line = scan.readLine();
			Matcher mat = pat.matcher(line);
			if(!mat.matches()) {
				System.out.println("regex failed");
				return;
			}
			int i = Integer.parseInt(mat.group(1)), j = Integer.parseInt(mat.group(2));
			int mi = map.get(i), mj = map.get(j);
			if(mi < mj)
				continue;
			
			for(int n = mj; n < mi; n++) {
				arr[n] = arr[n + 1];
				map.put(arr[n], n);
			}
			arr[mi] = j;
			map.put(j, mi);
		}
		for(int i : arr)
			System.out.print("T" + i + " ");
		scan.close();
	}
}