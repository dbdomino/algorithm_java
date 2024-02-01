package com.ex.baekjoon.배열2차원;

import java.util.Scanner;

public class ex2566 {
    public static void main(String[] args) {
        //  9×9 격자판에 쓰여진 81개의 자연수 또는 0이 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 행 몇 열에 위치한 수인지 구하는
        int[][] arr1 = new int[9][9];
        Scanner sc = new Scanner(System.in);
        int max = -1;
        int row_j = -1;
        int col_i = -1;

        for(int i =0; i<9; i++){
            for(int j=0; j<9; j++) {
                arr1[i][j] = sc.nextInt();
                if (arr1[i][j] > max){
                    max = arr1[i][j];
                    row_j = j;
                    col_i = i;
                }
            }
        }
        sc.close();
        System.out.println(max);
        System.out.println((col_i+1) + " "+ (row_j+1));
    }
}
