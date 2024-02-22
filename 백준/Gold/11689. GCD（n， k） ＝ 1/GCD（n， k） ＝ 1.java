import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 자연수 n이 주어졌을 때, GCD(n, k) = 1을 만족하는 자연수 1 ≤ k ≤ n 의 개수를 구하는 프로그램을 작성하시오.
        // 오일러 파이  함수?
        /**
         * 오일러 곱셈적 함수
         * ϕ(mn) = ϕ(m)*ϕ(n)가 성립된다
         * p가 소수일 때 ϕ(p^a)의 계산법은 다음과 같다. p가 소수라면, p^a와 서로소가 아닌 수들은 반드시 p를 인수로 가져야 한다. 1부터 p^ka 지의 수 중 이런 수들은 p^a/p = p^a-1개가 있다. 따라서 다음 공식이 성립된다.
         */

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        double result = n;
        for (long p = 2; p * p <= n; p++) // 에라토스테네스 체
        {
            // p가 소인수인지 확인  (소인수란 주어진 자연수를 나누어 떨어뜨리는 약수 중에서 소수인 약수)
            if (n % p == 0)
            {
                while (n % p == 0) // 아닐때 까지 나눠줌
                {
                    n /= p;
                }
                result *= (1.0 - (1.0 / (double) p)); // 오일러공식
            }
        }
        //위에 다하면 한개가 남음(위에서 p*p로 걸렀기 때문에, 5이면 남음)
        if (n > 1) result *= (1.0 - (1.0 / (double) n));

        System.out.println((long) result); 


        sc.close();
    }
}
