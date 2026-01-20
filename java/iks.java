import java.io.*;
import java.math.*;
import java.util.*;

public class iks {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        boolean[] sieve = new boolean[1000000];
        List<Integer> primes = new ArrayList<>();
        for(int i = 2; i < sieve.length; i++) {
            if(sieve[i])
                continue;
            primes.add(i);
            for(int j = i << 1; j < sieve.length; j += i)
                sieve[j] = true;
        }
        
        int N = Integer.parseInt(br.readLine());
        int[] s = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] f = new int[N][primes.size()];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < primes.size() && s[i] > 1; j++)
                while(s[i] % primes.get(j) == 0) {
                    s[i] /= primes.get(j);
                    f[i][j]++;
                }
        }
        
        int[] fs = new int[primes.size()];
        for(int[] r : f)
            for(int i = 0; i < r.length; i++)
                fs[i] += r[i];
        for(int i = 0; i < primes.size(); i++)
            fs[i] /= N;
            
        int score = 1;
        for(int i = 0; i < primes.size(); i++)
            for(int j = 0; j < fs[i]; j++)
                score *= primes.get(i);
        
        int ops = 0;
        for(int[] r : f)
            for(int i = 0; i < r.length; i++)
                for(int j = r[i]; j < fs[i]; j++)
                    ops++;
        
        System.out.println(score + " " + ops);
            
    }
}