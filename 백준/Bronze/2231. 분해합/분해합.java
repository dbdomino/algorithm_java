import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합
        // 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다
        // 예를 들어, 245 M의 분해합은 256(=245+2+4+5) N이 된다. 따라서 245 M는 256 N의 생성자가 된다.

        // 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
        // N의 가장 작은 생성자를 구해내는 프로그램
        // M + M1+M2+M3 = N , N의 최소값?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int size = String.valueOf(n).length();
        int answer= 0;
        
        for (int i = n-size*9; i<=n; i++){
            int sum = i;
            int k = i; // 한 자리씩 구하는용
            while(k > 0) {
                sum += k % 10; 
                k /= 10;
            }
            if(sum == n) { // 더한 값이 n이 된다면 i는 생성자가 성립된다.
                answer = i;
                break;
            }
        }

        System.out.println(answer);

        br.close();

    }
}