package com.ex.baekjoon.직사각형과삼각형;

import java.util.Scanner;

public class ex15894 {
    public static void main(String[] args) {
        // "한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다.
        // 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오."
        //가장 아랫부분의 정사각형 개수가 주어지면 그에 해당하는 답을 출력하는 프로그램을 만들어 형석이를 도와주자!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        // 규칙이 있다 n -> n + n*3
        System.out.println(n + n*3);
    }
}
