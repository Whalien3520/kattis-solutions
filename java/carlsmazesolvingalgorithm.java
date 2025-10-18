import java.io.*;
import java.util.*;

public class carlsmazesolvingalgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dims = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), start = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray(), end = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] m = new char[dims[0]][dims[1]];
        for(int i = 0; i < dims[0]; i++)
            m[i] = br.readLine().toCharArray();
        start[0]--;
        start[1]--;
        end[0]--;
        end[1]--;
        Set<Integer> vis = new HashSet<>();
        int face = 0, cur = encode(start[0], start[1], face);
        while(!vis.contains(cur)) {
            if(start[0] == end[0] && start[1] == end[1]) {
                System.out.println(1);
                return;
            }
            vis.add(cur);
            int[] l = coords(start[0], start[1], (face + 1) % 4);
            if(l[0] >= 0 && l[0] < dims[0] && l[1] >= 0 && l[1] < dims[1] && m[l[0]][l[1]] == '0') {
                start[0] = l[0];
                start[1] = l[1];
                face = (face + 1) % 4;
            }
            else {
                l = coords(start[0], start[1], face);
                if(l[0] >= 0 && l[0] < dims[0] && l[1] >= 0 && l[1] < dims[1] && m[l[0]][l[1]] == '0') {
                    start[0] = l[0];
                    start[1] = l[1];
                }
                else
                    face = (face - 1 + 4) % 4;
            }
            cur = encode(start[0], start[1], face);
        }
        System.out.println(0);
    }
    private static int encode(int r, int c, int f) {
        return (r << 16) + (c << 8) + f;
    }
    private static int[] coords(int r, int c, int f) {
        return new int[] {r + (f == 1 ? -1 : f == 3 ? 1 : 0), c + (f == 0 ? 1 : f == 2 ? -1 : 0)};
    }
}