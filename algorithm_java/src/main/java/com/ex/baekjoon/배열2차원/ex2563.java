package com.ex.baekjoon.배열2차원;

import java.util.Scanner;

public class ex2563 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;  //검은 영역의 넓이
        int n = sc.nextInt();  //색종이 개수
        boolean[][] arr = new boolean[101][101];  // 값이 들어갔는지 비교하기 위한 기본 도화지
        for (int i = 0; i < n; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();
            //(x,y)부터 (x+9, y+9)까지의 영역을 하나씩 체크한 후 총 넓이에 더해준다
            for (int j = x; j < x+10; j++) {
                for (int k = y; k < y+10; k++) {
                    if (!arr[j][k]) { // 아 boolean에 넣고 flase이면 true로 바꾸고,,,
                        arr[j][k] = true;
                        result++;
                    }
                }
            }
        }
        System.out.print(result);

    }
}
