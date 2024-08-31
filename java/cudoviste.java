import java.io.*;
import java.math.*;
import java.util.*;

public class cudoviste {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] RC = Arrays.stream(r.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] map = new char[RC[0]][RC[1]];
        for(int i = 0; i < RC[0]; i++)
            map[i] = r.readLine().toCharArray();
        int zero = 0, one = 0, two = 0, three = 0, four = 0;
        for(int i = 0; i < RC[0] - 1; i++)
            for(int j = 0; j < RC[1] - 1; j++) {
                int space = 0, car = 0, build = 0;
                for(int k = i; k < i + 2; k++)
                    for(int l = j; l < j + 2; l++) {
                        if(map[k][l] == 'X')
                            car++;
                        else if(map[k][l] == '#')
                            build++;
                    }
                if(build > 0)
                    continue;
                if(car == 0)
                    zero++;
                else if(car == 1)
                    one++;
                else if(car == 2)
                    two++;
                else if(car == 3)
                    three++;
                else
                    four++;
            }
        System.out.println(zero);
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
    }
}