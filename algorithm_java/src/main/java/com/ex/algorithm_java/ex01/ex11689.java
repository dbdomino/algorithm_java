package com.ex.algorithm_java.ex01;

import java.util.Scanner;

public class ex11689 {
    public static void main(String[] args) {
        // 자연수 n이 주어졌을 때, GCD(n, k) = 1을 만족하는 자연수 1 ≤ k ≤ n 의 개수를 구하는 프로그램을 작성하시오.
        // 오일러 파이  함수?
        /**
         *      1) GCD : 최대공약수
         *      2) 서로소 : 두 수의 최대공약수가 1, 최소공배수는 두수의 곱
         *      3) 소인수 : 자연수를 나누어 떨어지는 수 중 소수인 것 (10의 경우 1 2 5 10 중 2, 5에 해당)
         * 오일러 곱셈적 함수
         * ϕ(mn) = ϕ(m)*ϕ(n)가 성립된다
         * p가 소수일 때 ϕ(p^a)의 계산법은 다음과 같다. p가 소수라면, p^a와 서로소가 아닌 수들은 반드시 p를 인수로 가져야 한다.
         */

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();


        double result = n;

        for (int i = 2; i <= Math.sqrt(n); ++i) { //제곱근까지만 진행함
            if (n % i == 0) { //i가 소인수인지 확인함
                result = result - result / i; //결과값 개수를 업데이트 함
                while (n % i == 0) { //소인수 i를 바로바로 지움 중복삭제를 방지
                    n /= i;
                }
            }
        }
        if (n > 1) { //제곱근까지 진행했기에 1개의 소인수가 누락될 수 있음
            result = result - result / n;
        }
        System.out.println((long) result);

/*        for (long p = 2; p * p <= n; p++) // 에라토스테네스 체
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

        System.out.println((long) result);*/


/*        long pi = n;
        for(long i=2; i*i<=n; i++) {
            if(n%i==0) {
                pi = pi/i*(i-1);
            }
            while(n%i==0) {
                n/=i;
            }

        }
        if(n!=1) {
            pi = pi/n*(n-1);
        }
        System.out.println(pi);*/

        sc.close();
    }

    public static long gcd(long a, long b) {
        while (b>0) {
            long tmp = a%b;
            a = b;
            b = tmp;

        }
        return a;
    }
}
