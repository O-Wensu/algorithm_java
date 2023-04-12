import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int n, m;
    public static int[] numbers;
    public static int[] arr;
    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void dfs(int depth, int start) throws IOException{
        if (depth == m) {
            for (int i : arr) {
                bw.write(i + " ");
            }
            bw.write("\n");
            return;
        }
        int prev = 0;
        for (int i = start; i < numbers.length; i++) {
            if (prev != numbers[i]) {
                arr[depth] = numbers[i];
                prev = numbers[i];
                dfs(depth + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        n = Integer.parseInt(tk.nextToken());
        m = Integer.parseInt(tk.nextToken());
        numbers = new int[n];
        arr = new int[m];

        tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(tk.nextToken());
        }
        Arrays.sort(numbers);
        dfs(0, 0);
        bw.flush();
        bw.close();
        br.close();
    }
}