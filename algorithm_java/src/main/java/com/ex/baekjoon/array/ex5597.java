package com.ex.baekjoon.array;


import java.util.*;
import java.util.stream.Collectors;

public class ex5597 {
    public static void main(String[] args) {
        int[] nArr = new int[30]; // 기본값 false로 초기화됨
        Scanner sc = new Scanner(System.in);
        for (int i =0; i< 28; i++){
            int a = sc.nextInt() ;
            nArr[a-1] = a;
        }
//        List<Integer> alist = Arrays.stream(nArr).boxed().toList();
        List<Integer> aArrI = new ArrayList<>();
        for (int i=0; i<30; i++) {
            if (nArr[i] == 0) aArrI.add(i+1);
        }
        System.out.println(aArrI.get(0) + " " + aArrI.get(1));

    }
}
