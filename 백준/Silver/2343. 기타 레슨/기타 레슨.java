import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken()); // 강의수
        m = Integer.parseInt(st.nextToken()); // 블루레이수
        arr = new int[n];
        int max =0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++ ){
            arr[i]= Integer.parseInt(st.nextToken());
            max = Math.max(max,arr[i]);
        }
        /*
Math.floor(a); // 버림
Math.abs(a); // 절대값
Math.ceil(a); // 올림
Math.round(a); // 반올림
         */
        System.out.println(solve(max, Integer.MAX_VALUE));
    }
    static int n, m;
    static int[] arr;
    public static long solve(long start, long end) {
        while (start <= end) {
            long sum = 0;
            long mid = (start + end) / 2;
            int count = 1;

            for (int i = 0; i < n; i++) {
                sum += arr[i];
                if (sum > mid) {
                    sum = arr[i];
                    count += 1;
                }
            }
            if (count <= m) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
