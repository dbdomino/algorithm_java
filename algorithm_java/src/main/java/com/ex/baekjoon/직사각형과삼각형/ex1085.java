package com.ex.baekjoon.직사각형과삼각형;

import java.util.Scanner;
// 한수는 지금 (x, y)에 있다.
// 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다.
// 직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
public class ex1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        // 각 직사각형의 변까지의 거리인 x, w-x, y, h-y 중 최솟값을 출력한다.
//        int result = minLengthX <= minLengthY ? minLengthX : minLengthY;
        System.out.println(Math.min(Math.min(x, w-x),Math.min(y,h-y)));

        sc.close();
    }
}
