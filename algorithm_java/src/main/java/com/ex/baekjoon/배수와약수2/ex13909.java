package com.ex.baekjoon.배수와약수2;


import java.util.Scanner;

public class ex13909 {
    /**
     * 예를 들어 현재 3개의 창문이 있고 3명의 사람이 있을 때,
     *
     * 1번째 사람은 1의 배수인 1,2,3번 창문을 연다. (1, 1, 1)
     * 2번째 사람은 2의 배수인 2번 창문을 닫는다. (1, 0, 1)
     * 3번째 사람은 3의 배수인 3번 창문을 닫는다. (1, 0, 0)
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // 현재 N개의 창문이 있고 또 N명의 사람이 있다
        // 1번째 사람은 1의 배수 번째 창문을 열려 있으면 닫고 닫혀 있으면 연다
        // 첫 번째 줄에는 창문의 개수와 사람의 수 N(1 ≤ N ≤ 2,100,000,000)이 주어진다.
        // 마지막에 열려 있는 창문의 개수를 출력한다.


        /*
        소인수 분해했을때 소인수의 갯수가 홀수가 되는 수이다.
        즉, 1, 4, 9, 16, 25처럼 n^2의 값들이다.
        주어지는 N을 제곱근으로 나누어서 자신보다 작은 수의 값을 출력한다.

        ( n번째 창문이 열려있는 경우 = n번째 창문을 열고 닫는 횟수가 홀수번 = n의 약수가 홀수 개 = 제곱수 )
        ( ∴ 열려있는 창문의 수 = n이하의 제곱수의 수 )
         */

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        // 열려있는 창문의 개수
        int cnt = 0;/*
        for(int i=1; i*i<=n; i++){ // 제곱되는 개수라...
            cnt++;
        }
        System.out.println(cnt);*/

        System.out.println((int)Math.floor(Math.sqrt(n))); // 제곱근을 구하고내림.

    }
}
