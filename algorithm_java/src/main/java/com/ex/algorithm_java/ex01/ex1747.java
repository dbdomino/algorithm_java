package com.ex.algorithm_java.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 소수 팰린드롬
public class ex1747 {
    public static void main(String[] args) throws IOException {
        //어떤 수와 그 수의 숫자 순서를 뒤집은 수가 일치하는 수를 팰린드롬이라 부른다.
        // 예를 들어 79,197과 324,423 등이 팰린드롬 수이다.
        //어떤 수 N (1 ≤ N ≤ 1,000,000)이 주어졌을 때, N보다 크거나 같고,
        // 소수이면서
        // 팰린드롬인 수 중에서, 가장 작은 수를 구하는 프로그램을 작성하시오.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 1){ // 1은 소수로 안치니까
            System.out.println(2);
            System.exit(0);
        }
        for (int i = n; ; i++){
            if (isPalind(i) && isPrime(i)){
                System.out.println(i);
                System.exit(0);
            }
        }
    }
    // 소수인지 판단하는 메소드
    public static boolean isPrime(int x){
        for (int i = 2; i <= Math.sqrt(x); i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
    }
    // 팰린드롬인지 판단하는 메소드
    public static boolean isPalind(int x) {
        String strX = Integer.toString(x);
        int cnt = strX.length(); // 길이
        for (int i = 0; i <= cnt / 2; i++){
            if (strX.charAt(i) != strX.charAt(cnt-i-1)){ // 첫번째   젤끝에가 같아야 팰린드롬
                return false;
            }
        }
        return true;
    }
}
