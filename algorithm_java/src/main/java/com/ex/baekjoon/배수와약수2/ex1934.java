package com.ex.baekjoon.배수와약수2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1934 {
    public static void main(String[] args) throws IOException {
        // A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다.
        // 예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
        //   //두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
        // 유클리드 호제법
        /*
        최대공약수 GCD = 유클리드 호제법 (Euclidean algorithm)
        두 수 a, b ∈ ℤ 이고, r = a mod b 이라고 한다. (r 은 a에 b를 나눈 나머지를 의미)
        이 때 r은 (0 ≤ r < b) 이고, a ≥ b 이다.
        이 때 a 와 b의 최대공약수를 (a, b)라고 할 때 (a, b)의 최대공약수는 (b, r)의 최대공약수와 같다.
        즉, 아래와 같다는 의미다.GCD(a, b) = GCD(b, r)
        예로 하나 들어보자. 두 수 581, 322 가 있다고 가정해보자.
    GCD(581, 322)일 때 r(나머지) = 259이다. 즉, GCD(581, 322) = GCD(322, 259)이다.그럼 다시 GCD(322, 259)를 보면 r=63이다. 그러면 GCD(322, 259) = GCD(259, 63)이다.또 다시 GCD(259, 63)을 보면 r=7이다. 즉, GCD(259, 63) = GCD(63, 7)이다.
    다시 GCD(63, 7)을 보면 r=0 이다. 그러면 GCD(63, 7) = GCD(7, 0)이다.
    결과적으로 나머지가 없다는 것은 공통된 약수로 나누어 떨어진다는 의미이므로 7이 최대공약수가 된다. 쉽게 쓰면 이렇다.

    최소공배수??
    생각해보자 A=ad, B= bd 에서 a 와 b 는 서로소이고, d 는 최대공약수라고 했다.
    쉽게 말하자면 두 수의 '소인수분해'를 한 결과의 공통된 부분이 최대공약수, 즉 d 라는 것이다.
    그러면 두 수의 최소 공배수는 자연스럽게 a×b/d 이지 않겠는가?

    한 마디로 최대공약수를 구해준 뒤 입력받은 두 수의 곱에서 최대공약수를 나눠주면 끝난다.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st ;
/*
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int d = gcd(a, b);	// 최대공약수

        System.out.println(d);
        System.out.println(a * b / d);// 최소공배수

 */
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

    // 최대공약수 재귀 방식
    public static int gcd2(int a, int b) {
        if(b == 0) return a;
        // GCD(a, b) = GCD(b, r)이므로 (r = a % b)
        return gcd(b, a % b);
    }

    // 최소공배수 : Least Common mulitple
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b); // 최대공약수 * a * b = 최소공배수
    }
}
