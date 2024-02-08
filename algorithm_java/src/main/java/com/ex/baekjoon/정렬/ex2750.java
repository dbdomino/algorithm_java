package com.ex.baekjoon.정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// N개의 수가 주어졌을 때, 이를 오름차순
public class ex2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++) {
            arr[i]= sc.nextInt();
        }
        sc.close();
        Arrays.sort(arr);
//        arr =  Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(Integer::intValue).toArray(); // 내림차순정렬
        for (int i=0;i<n;i++) {
            System.out.println(arr[i]);
        }


        int[] data = {5, 6, 4, 2, 3, 1, 1, 2, 2, 4, 8};


        // 내림차순 정렬
        int[] result = Arrays.stream(data)  // IntStream을 생성한다.
                //중간처리, 여러 작업을 이어서 가능, 메서드 체이닝
                .boxed()  // IntStream을 Stream<Integer>로 변경한다.
//                .filter((a) -> a % 2 == 0)  //  짝수만 뽑아낸다.
//                .distinct()  // 중복을 제거한다.
                .sorted(Comparator.reverseOrder())  // 역순으로 정렬한다.
                //최종 처리(intstream으로 변경 및 배열로 반환)
                .mapToInt(Integer::intValue)
                .toArray();
//        System.out.println(Arrays.toString(result));
    }
}
