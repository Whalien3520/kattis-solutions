import java.io.*;
import java.util.*;

public class curling {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int r = 0, y = 0;
        for(int i = 0; i < 10; i++) {
            int[] pr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double[] dr = new double[pr[0]];
            double minr = Double.MAX_VALUE;
            for(int j = 0; j < pr[0]; j++) {
                dr[j] = Math.pow(144.0 - pr[2 * j + 1], 2) + Math.pow(84.0 - pr[2 * j + 2], 2);
                minr = Math.min(minr, dr[j]);
            }
            int[] py = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            double[] dy = new double[py[0]];
            double miny = Double.MAX_VALUE;
            for(int j = 0; j < py[0]; j++) {
                dy[j] = Math.pow(144.0 - py[2 * j + 1], 2) + Math.pow(84.0 - py[2 * j + 2], 2);
                miny = Math.min(miny, dy[j]);
            }
            for(double w : (minr < miny ? dr : dy))
                    if(w < (minr < miny ? miny : minr)) {
                        if(minr < miny)
                            r++;
                        else
                            y++;
                    }
        }
        System.out.println(r + " " + y);
    }
}