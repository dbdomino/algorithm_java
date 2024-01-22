package com.ex.baekjoon.array;

import java.util.Arrays;
import java.util.Collections;

public class IntArr {
    public static void main(String[] args) {
        int[] intArr = {8,7,6,5,4};
        for(int i: intArr)
            System.out.print(i + " ");
        System.out.println();
        //8 7 6 5 4

        Arrays.sort(intArr); // 오름차순 정렬
        for (int i : intArr)
            System.out.print(i + " ");
        System.out.println();
        //4 5 6 7 8

//        Arrays.sort(intArr, Collections.reverseOrder()); // 내림차순 정렬, 에러 int[]는 sort로 역순정렬 하려면 wrapping 해야한다.
       // 번거로우므로 로직만들어서 수행
        reverseSort(intArr); //
        for (int i : intArr)
            System.out.print(i + " ");
        // 8 7 6 5 4

    }
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}

