import java.io.*;
import java.util.*;
import java.math.*;
public class runningsteps {
    public static void main(String[] args) throws IOException {
        ArrayList<BigInteger> facs = new ArrayList<>();
        facs.add(BigInteger.valueOf(1));
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(r.readLine());
        while(P-- > 0) {
            int[] a = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int half = a[1] / 2;
            int twos = half / 2;
            BigInteger ret = BigInteger.valueOf(0);
            while((half - (2 * twos)) <= twos) {
                int sum = twos + (half - (2 * twos));
                while(facs.size() <= sum)
                    facs.add(facs.get(facs.size() - 1).multiply(BigInteger.valueOf(facs.size())));
                BigInteger comb = facs.get(sum).divide(facs.get(twos)).divide(facs.get(half - (2 * twos)));
                comb = comb.multiply(comb);
                ret = ret.add(comb);
                twos--;
            }
            System.out.println(a[0] + " " + ret);
        }
    }
}