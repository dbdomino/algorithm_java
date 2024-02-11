import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int d = gcd(a, b);	// 최소 공배수 구하기

            sb.append(a * b / d).append('\n');
        }
        System.out.println(sb);

    }
    // 최대공약수 반복문 방식
    public static int gcd(int a, int b) {

        while(b != 0) {
            int r = a % b;	// 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r; // 나머지가 0일때 a의값이 최대공약수
        }
        return a;
    }

}
