package com.ex.baekjoon.배수와약수;

import java.util.Scanner;
/*
소수 판별 방법
소수 판별법은 정말 여러가지가 있다.
그 중 대표적인 방법 2가지를 알아보려 한다.
방법 1 : 기본 판별 법
// 2 ~ Number-1 까지 중 나누어 떨어지는 약수가 있는지 판별
	// Number = 2 의 경우는 자연스럽게 for문을 검사하지 않게 됨
    for(int i = 2; i < Number; i++) {
        if(N % i == 0) return false;
	}

방법 2 : 제곱근을 이용한 기본 판별법 (소수일 경우 제곱근을 기준으로 나누더라도 결국 나눠지는건 없을것이므로),
    for(int i = 2; i <= Math.sqrt(Number); i++) {
		if(N % i == 0) return false;
	}

기본, 1은 소수가 아니다.

 */
public class ex1978 {
    public static void main(String[] args) {
        // 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i=0; i<n; i++){
            int m = sc.nextInt();

            if (m==1) continue; // 1은 소수로 치지 않으므로 검사에서 제외한다.
            if (cal(m)) cnt++;


        }
        System.out.println(cnt);
        sc.close();
    }
    public static boolean cal(int n) {
//        for (int j = 2; j<n; j++){
//            if (n % j == 0) return false;
//        }
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        return true;
    }
}
