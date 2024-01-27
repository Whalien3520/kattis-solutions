import java.io.*;
import java.util.*;
public class bitbybit {
	public static void main(String[] args) throws IOException {
		BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
		int n;
		while((n = Integer.parseInt(scan.readLine())) != 0) {
			int[] arr = new int[32];
			Arrays.fill(arr, -1);
			while(n-- > 0) {
				String[] line = scan.readLine().split(" ");
				switch(line[0]) {
				case "CLEAR":
					arr[Integer.parseInt(line[1])] = 0;
					break;
				case "SET":
					arr[Integer.parseInt(line[1])] = 1;
					break;
				case "OR": {
					int i = Integer.parseInt(line[1]), j = Integer.parseInt(line[2]);
					if(arr[i] == 1 || arr[j] == 1)
						arr[i] = 1;
					else if(arr[i] == -1 || arr[j] == -1)
						arr[i] = -1;
					// no need to set arr[i] = 0 if arr[i] == 0 && arr[j] == 0
					break;
					}
				case "AND": {
					int i = Integer.parseInt(line[1]), j = Integer.parseInt(line[2]);
					if(arr[i] == 0 || arr[j] == 0)
						arr[i] = 0;
					else if(arr[i] == -1 || arr[j] == -1)
						arr[i] = -1;
					// no need to set arr[i] = 1 if arr[i] == 1 && arr[j] == 1
					break;
					}
				default:
					System.out.println("unidentified instruction");
					System.exit(1);
				}
			}
			for(int i = 31; i > -1; i--)
				System.out.print(arr[i] == -1 ? "?" : arr[i]);
			System.out.println();
		}
		scan.close();
	}
}