package com.ex.baekjoon.배수와약수;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex5086 {
    /*
    4 × 3 = 12이다.
이 식을 통해 다음과 같은 사실을 알 수 있다.
3은 12의 약수이고, 12는 3의 배수이다.
4도 12의 약수이고, 12는 4의 배수이다.
두 수가 주어졌을 때, 다음 3가지 중 어떤 관계인지 구하는 프로그램을 작성하시오.

첫 번째 숫자가 두 번째 숫자의 약수이다. factor
첫 번째 숫자가 두 번째 숫자의 배수이다. multiple
첫 번째 숫자가 두 번째 숫자의 약수와 배수 모두 아니다. neither

약수 : a가 b로 나눠떨어질때, 나머지가 0일때 b는 a의 약수라고 한다.
      12  3   - > 3은 12의 약수        3  12
배수 : b를 n곱해서 a가 나올때 b*n= a 일때 a를 b의 배수라고 한다.
      3   4      12       3 4  12    12  3
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        while (true) {
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 ) break;

            // 첫 번째 수가 두 번째 수의 약수일 때 (= 두 번째 수가 첫 번째 수의 배수일 때)
            if (b % a == 0 ) sb.append("factor").append("\n");
            // 첫 번째 수가 두 번째 수의 배수일 때 (= 두 번째 수가 첫 번째 수의 약수일 때)
            else if (a % b == 0 ) sb.append("multiple").append("\n");
            else sb.append("neither").append("\n");

            st= new StringTokenizer(br.readLine());

        }
        System.out.println(sb);
        br.close();
    }
}
