import java.io.*;
import java.util.*;
public class towering {
    public static void main(String args[]) throws IOException {
        int[][][] lookup = {{{0,1,2},{3,4,5}},
                        {{0,1,3},{2,4,5}},
                        {{0,1,4},{2,3,5}},
                        {{0,1,5},{2,3,4}},
                        {{0,2,3},{1,4,5}},
                        {{0,2,4},{1,3,5}},
                        {{0,2,5},{1,3,4}},
                        {{0,3,4},{1,2,5}},
                        {{0,3,5},{1,2,4}},
                        {{0,4,5},{1,2,3}}};
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int[][] look : lookup) {
            int sum = a[look[0][0]] + a[look[0][1]] + a[look[0][2]];
            if(sum == a[6]) {
                int[] t1 = new int[] {a[look[0][0]], a[look[0][1]], a[look[0][2]]};
                int[] t2 = new int[] {a[look[1][0]], a[look[1][1]], a[look[1][2]]};
                Arrays.sort(t1);
                Arrays.sort(t2);
                System.out.println(t1[2] + " " + t1[1] + " " + t1[0] + " " + t2[2] + " " + t2[1] + " " + t2[0]);
                return;
            }
            if(sum == a[7]) {
                int[] t2 = new int[] {a[look[0][0]], a[look[0][1]], a[look[0][2]]};
                int[] t1 = new int[] {a[look[1][0]], a[look[1][1]], a[look[1][2]]};
                Arrays.sort(t1);
                Arrays.sort(t2);
                System.out.println(t1[2] + " " + t1[1] + " " + t1[0] + " " + t2[2] + " " + t2[1] + " " + t2[0]);
                return;
            }
        }
    }
}