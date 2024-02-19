import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class dunglish {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Dung> map = new HashMap<>();
		int n = Integer.parseInt(scan.readLine());
		String[] arr = scan.readLine().split(" ");
		for(String s : arr) {
			if(map.containsKey(s))
				map.get(s).count++;
			else
				map.put(s, new Dung());
		}
		int m = Integer.parseInt(scan.readLine());
		while(m-- > 0) {
			String[] line = scan.readLine().split(" ");
			if(map.containsKey(line[0])) {
				Dung d = map.get(line[0]);
				d.strings.add(line[1]);
				d.corrects.add((line[2].equals("correct") ? true : false));
			}
		}
		BigInteger total = BigInteger.ONE;
		Iterator<Dung> iter = map.values().iterator();
		while(iter.hasNext()) {
			Dung d = iter.next();
			total = total.multiply(BigInteger.valueOf(d.strings.size()).pow(d.count));
			
		}
		if(total.compareTo(BigInteger.ONE) == 0) {
			boolean b = true;
			for(String s : arr) {
				Dung d = map.get(s);
				b &= d.corrects.get(0);
				System.out.print(d.strings.get(0) + " ");
			}
			System.out.println("\n" + (b ? "correct" : "incorrect"));
			return;
		}
		BigInteger corrects = BigInteger.ONE;
		
		iter = map.values().iterator();
		while(iter.hasNext()) {
			Dung d = iter.next();
			BigInteger dCorrects = BigInteger.ZERO;
			for(Boolean b : d.corrects)
				if(b)
					dCorrects = dCorrects.add(BigInteger.ONE);
			corrects = corrects.multiply(dCorrects.pow(d.count));
		}
		System.out.println(corrects + " correct");
		System.out.println((total.subtract(corrects)) + " incorrect");
		scan.close();
	}
	static class Dung {
		int count;
		ArrayList<String> strings;
		ArrayList<Boolean> corrects;
		public Dung() {
			count = 1;
			strings = new ArrayList<>();
			corrects = new ArrayList<>();
		}
	}
}
