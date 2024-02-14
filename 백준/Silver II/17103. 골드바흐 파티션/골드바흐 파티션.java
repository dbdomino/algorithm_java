import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
        // 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.
        // 첫째줄엔 N의개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 두 소수의 합이 N이 되는 개수를 구해야한다.
        // 소수부터 구하자 정수 N은 짝수이고, 2 < N ≤ 1,000,000을 만족
        boolean[] prime = new boolean[1000001];
        prime[0]=true; prime[1]=true;

        for(int i=2; i*i <= prime.length; i++) {

            if(prime[i]) continue;
            for (int j = i*i; j< prime.length; j+=i) {
                prime[j] = true;
            }
        }

        StringBuffer sb = new StringBuffer();
        // 입력받은 n번만큼 N/2씩 반복문을 돌면서 해당 숫자가 소수면서 N에서 소수를 뺀 값이 소수면 count를 1씩 증가시키면 된다
        for(int a : arr){
            int cnt=0;
            for (int i=2; i<= a/2; i++) { // a/2해주는 이유는 i가 반이상넘어갈때 앞뒤만 바꿔 중복계산이 되므로.
                if (!prime[i] && !prime[a-i])  //i +(a-i) =a = N 이므로, prime[i]가 소수일 때, N-i 도 소수이면 cnt++ 즉,소수끼리 더한다는게 이런느낌이구나...
                    cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);

        br.close();

    }
}