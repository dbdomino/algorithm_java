package com.ex.baekjoon.심화;

import java.util.Scanner;

/*
가장 많이 반복된 문자가 2개 이상일 경우 ? 을 출력한다.
대문자와 소문자의 구분은 없다.
출력 문자는 대문자로 한다.
 */
public class ex1157 {
    public static void main(String[] args) {
        // 1. 먼저 문자열을 입력받기에 앞서 각 문자들의 빈도수를 나타내기 위한 배열을 하나 선언하고 문자열 s 를 입력받는다.
        int[] arr = new int[26]; // 영문자의 개수는 26개임

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 2. 대문자 소문자 구분해서 개수 배열에다 저장
        for (int i = 0; i < s.length(); i++){
            if (65 <= s.charAt(i) && s.charAt(i) <= 90) { // 대문자 범위
                arr[s.charAt(i) - 65]++;	// 해당 인덱스의 값 1 증가
            }

            else {	// 소문자 범위
                arr[s.charAt(i) - 97]++;
            }
        }

        // 3. 배열의 원소들의 값을 비교하여 가장 큰 값을 갖고있는 인덱스의 문자를 출력해야한다.
        //  이를 위해 최댓값을 저장할 max 라는 변수를 선언하고, 출력할 문자 변수 ch 를 선언한다.
        int max = -1;// 최대값 인덱스
        char result = 0; // 결과
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i]; // 최대값 갱신
                result = (char) (i+65);// 대문자로 출력하기 위해
            } else if (arr[i] == max) { // 개수같은게 있다면 ?로 출력
                result = '?';

            }
        }
        System.out.print(result);

    }
}
