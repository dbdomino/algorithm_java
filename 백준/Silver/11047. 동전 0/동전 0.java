import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 그리디 문제
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  //동전 종류 개수
        int k = Integer.parseInt(st.nextToken());  //가치의 합

        int[] coin = new int[n];  //동전 값들
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        int count = 0;

        for (int i = n-1; i >= 0; i--) {
            if (k / coin[i] > 0) {
                count += (k/coin[i]);
                k -= (k/coin[i])*coin[i];
            }
        }
        System.out.print(count);

    }
}
