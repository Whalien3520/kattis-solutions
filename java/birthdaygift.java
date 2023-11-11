import java.io.*;
public class birthdaygift {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = scan.readLine().split(" ");
		long a = Long.parseLong(arr[0]);
		int b = Integer.parseInt(arr[1]);
		
		if(a == 1) {
			System.out.println((b > 9 || b == 0) ? "0" : "1");
			System.exit(0);
		}
		
		if(a == 2) {
			if(b < 10 || b > 99)
				System.out.println(0);
			else 
				System.out.println((b % 11 == 0) ? "0" : "1");
			System.exit(0);
		}

		//get minus three because need to process second-to-last digit, and 2 digits pre-calculated
		a -= 3;
		
		long[][] mat = new long[90][90];
		//setup matrix one column at a time
		for(int col = 0; col < 90; col++) {
			//the new number modulo 9
			int newMod = col / 10;
			//the new number's digit
			int newDig = col % 10;
			
			//for every old combination
			for(int row = 0; row < 90; row++) {
				int oldMod = row / 10;
				int oldDig = row % 10;
				if(oldDig != newDig && (oldMod + newDig) % 9 == newMod) {
					mat[row][col] = 1;
				}
			}
		}
		
		//initialize matrix as identity matrix
		long[][] finish = new long[90][90];
		for(int i = 0; i < 90; i++)
			finish[i][i] = 1;
		//matrix exponentiation by squaring
		while(a > 0) {
			if(a % 2 == 1)
				finish = matrixMultiplication(finish, mat);
			mat = matrixMultiplication(mat, mat);
			a = a >> 1;
		}
		
		//set up row vector with 90 elements
		long[][] vector = new long[1][90];
		for(int i = 10; i < 100; i++) {
			if(i % 11 == 0)
				continue;
			int mod = i % 9;
			int dig = i % 10;
			vector[0][mod * 10 + dig]++;
		}
		
		//vector for total possibilities of a-1 digits
		long[][] retVector = matrixMultiplication(vector, finish);
		long ret = 0;
		//for every digit-mod9 combination
		for(int i = 0; i < 90; i++) {
			int mod = i / 10;
			int dig = i % 10;
			//for every new digit
			for(int j = 0; j < 10; j++) {
				if(dig != j && (dig * 10 + j) % 25 == (b % 25) && (mod + j) % 9 == (b % 9))
					ret += retVector[0][i];
			}
		}
		System.out.println(ret % 1000000007);
	}
	public static long[][] matrixMultiplication(long[][] a, long[][] b) {
		long[][] ret = new long[a.length][b[0].length];
		for(int r = 0; r < ret.length; r++) {
			for(int c = 0; c < ret[0].length; c++) {
				ret[r][c] = 0;
				for(int rc = 0; rc < a[0].length; rc++) {
					ret[r][c] += a[r][rc] * b[rc][c];
					ret[r][c] = ret[r][c] % 1000000007;
				}
			}
		}
		return ret;
	}
}
