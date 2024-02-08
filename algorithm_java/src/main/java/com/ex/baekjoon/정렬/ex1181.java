package com.ex.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// String 정렬
// 람다식으로 정렬조건 설정하기
public class ex1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr= new String[n];
        StringTokenizer st;
        //  길이가 짧은 것부터
        //1. 길이가 같으면 사전 순으로
        //단, 중복된 단어는 하나만 남기고 제거해야 한다.
        for (int i=0; i<n;i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1.length() < e2.length()) { // e1 e2의 첫번째인자가 같다면
                return e1.length() - e2.length(); // e1 e2의 두번째 인자를 가지고 비교
            } else if(e1.length() > e2.length()){
                return e1.length() - e2.length(); // e1 e2의 첫번째 인자로 비교, e1가 더크면 양수로로 자리바꿈 -> 오름차순
            } else {
//                return e1.charAt(0) - e2.charAt(0); // e1 e2의 첫번째 인자로 비교, e1가 더크면 양수로로 자리바꿈 -> 오름차순
                return e1.compareTo(e2);
            }
        });

        System.out.println(arr[0]);
        for (int i = 1; i < n; i++) {
            // 중복되지 않는 단어만 출력
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }

        br.close();
    }
}
