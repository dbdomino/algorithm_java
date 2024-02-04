package com.ex.baekjoon.배수와약수;

import java.util.Scanner;

public class ex2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 0 ;
        int result = 0;
//  M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최솟값을 찾는 프로그램을 작성하시오.
//예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로
//, 이들 소수의 합은 620이고, 최솟값은 61이 된다
        for (int i =m; i<=n; i++) {
            if (i == 1) { // 1은 소수가 아님 이런썩을
                continue;
            }
            if (cal(i)){
                if (min == 0 ) min = i;
                result += i;
            }
        }
        if (result == 0) {
            System.out.print(-1);
        } else {
            System.out.println(result);
            System.out.print(min);
        }
        sc.close();
    }
    // 소수인지 판단하는 메서드
    public static boolean cal(int n) {
//        for (int j = 2; j<n; j++){  2 ~ Number-1 까지 중 나누어 떨어지는 약수가 있는지 판별
//            if (n % j == 0) return false;
//        }
        // 방법 2 : 제곱근을 이용한 기본 판별법 (소수일 경우 제곱근을 기준으로 나누더라도 결국 나눠지는건 없을것이므로),
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false; // 하나라도 나눠떨어지는게 있다면 소수가 아님.
        }
        return true;
    }
}
