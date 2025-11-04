import java.io.*;
import java.math.*;
import java.util.*;

public class universityzoning {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        int[] RCFSG = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<int[]>> faculties = new ArrayList<>(RCFSG[2] + 1);
        faculties.add(new ArrayList<>()); // empty pq for padding, easier indexing later
        for(int i = 1; i <= RCFSG[2]; i++) {
            List<int[]> t = new ArrayList<int[]>();
            int[] c = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 1; j < c.length; j += 2)
                t.add(new int[] {c[j], c[j + 1]});
            Collections.sort(t, (a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0]) : Integer.compare(a[1], b[1]));
            faculties.add(t);
        }
        
        List<int[]> students = new ArrayList<>();
        for(int i = 0; i < RCFSG[3]; i++)
            students.add(Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        Collections.sort(students, (a, b) -> Integer.compare(a[2], b[2]));
        
        int[] facultiesIndex = new int[RCFSG[2] + 1];
        List<List<Integer>> facultySteps = new ArrayList<>(RCFSG[2] + 1);
        for(int i = 0; i <= RCFSG[2]; i++)
            facultySteps.add(new ArrayList<>());
        for(int i = 0; i < RCFSG[3]; facultiesIndex[students.get(i)[3]]++, i++) {
            int[] student = students.get(i), facultyCell = faculties.get(student[3]).get(facultiesIndex[student[3]]);
            facultySteps.get(student[3]).add(Math.abs(student[0] - facultyCell[0]) + Math.abs(student[1] - facultyCell[1]));
        }
        for(int i = 1; i <= RCFSG[2]; i++)
            Collections.sort(facultySteps.get(i));
        
        int[] T = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long[] facultyReqs = new long[RCFSG[2]];
        for(int i = 1; i <= RCFSG[2]; i++)
            for(int j = 0; j < T[i - 1]; j++)
                facultyReqs[i - 1] += facultySteps.get(i).get(j);
        Arrays.sort(facultyReqs);
            
        long ret = 0;
        for(int i = 0; i < RCFSG[4]; i++)
            ret += facultyReqs[i];
        
        bw.write(String.format("%d\n", ret));
        bw.flush();
    }
}