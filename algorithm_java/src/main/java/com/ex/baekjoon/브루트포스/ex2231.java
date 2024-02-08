package com.ex.baekjoon.브루트포스;

import java.util.Scanner;

public class ex2231 {
    public static void main(String[] args) {
        // 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합
        // 어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다
        // 예를 들어, 245 M의 분해합은 256(=245+2+4+5) N이 된다. 따라서 245 M는 256 N의 생성자가 된다.

        // 어떤 자연수의 경우에는 생성자가 없을 수도 있다. 반대로, 생성자가 여러 개인 자연수도 있을 수 있다.
        // N의 가장 작은 생성자를 구해내는 프로그램
        // M + M1+M2+M3 = N , N의 최소값?

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = String.valueOf(n).length(); // n의 자리수 구하기
        int start = n - (9 * size); // 시작 최솟값 구하기, 자리수마다 더하는게 가능하니까 2자리면 +9+9 3자리면 +9+9+9가능하므로
        int ans = 0;

        for(int i = start; i < n; i++) {
            int sum = i; // 합
            int k = i; // 한 자리씩 구해서 자리수 더하기
            while(k > 0) {
                sum += k % 10;
                k /= 10;
            }
            if(sum == n) { // 더한 값이 n이 된다면 i는 생성자가 성립된다.
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }

}
