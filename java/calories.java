import java.io.*;
import java.util.*;
public class calories {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int[] mults = new int[] {9, 4, 4, 4, 7};
        while(!(s = r.readLine()).equals("-")) {
            double retAll = 0.0, totAll = 0.0;
            do {
                String[] ar = s.split(" ");
                double perc = 0.0, sum = 0.0;
                for(int i = 0; i < ar.length; i++) {
                    int n = Integer.parseInt(ar[i].substring(0, ar[i].length() - 1));
                    switch(ar[i].charAt(ar[i].length() - 1)) {
                        case 'g':
                            sum += n * mults[i];
                            break;
                        case '%':
                            perc += n;
                            break;
                        case 'C':
                            sum += n;
                            break;
                        default:
                            System.out.println("switch 1 failed");
                            return;
                    }
                }
                sum = 1.0 / ((100 - perc) / 100) * sum;
                totAll += sum;
                int n = Integer.parseInt(ar[0].substring(0, ar[0].length() - 1));
                switch(ar[0].charAt(ar[0].length() - 1)) {
                    case 'g':
                        retAll += n * 9;
                        break;
                    case '%':
                        retAll += n / 100.0 * sum;
                        break;
                    case 'C':
                        retAll += n;
                        break;
                    default:
                        System.out.println("switch 2 failed");
                        return;
                }
            } while(!(s = r.readLine()).equals("-"));
            int p = (int)Math.round(retAll / totAll * 100.0);
            System.out.println(p + "%");
            
        }
    }
}