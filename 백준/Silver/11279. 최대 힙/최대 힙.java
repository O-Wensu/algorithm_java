import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < size; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                if (pq.isEmpty()) bw.write("0\n");
                else bw.write(pq.poll() + "\n");
            } else {
                pq.add(n);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}