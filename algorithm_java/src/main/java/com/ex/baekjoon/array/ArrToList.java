package com.ex.baekjoon.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrToList {
    public static void main(String[] args) {
        int[] nArr = {1,4,2,5,9,7,3};
        Integer[] nArr2 = {1,4,2,5,9,7,3};
//        List alist = Arrays.asList(nArr); // int형 배열로는 asList가 안된다.
//        List<int> alist = Arrays.asList(nArr); // int형 배열로는 asList가 안된다.
        List<Integer> alist2 = Arrays.asList(nArr2); // int형 배열로는 asList가 안된다.
        List<int[]> alist = Arrays.asList(nArr); // int형 배열하나만 넣는식으로는 가능하다...
        System.out.println(alist.toString());
        System.out.println(alist.get(0));
        System.out.println(Arrays.toString(alist.get(0)));
        // 위처럼 하지말고 별도로 리스트로 변환하는데 있어서, int를 Integer로 바꿔서 list에 저장시켜야 한다.
        // list의 규칙이니 따를수밖에 없다.
//        방법1 stream으로 변환하기
//        List<Integer> intList  = Arrays.stream(nArr)
//                .boxed() // IntStream을 Stream<Integer>로 변경한다. int 요소, long 요소, double 요소를 Integer, Long, Double 요소로 박싱해서 Stream을 생성
//                .collect(Collectors.toList());
//                .toList();
        // 방법2 반복문으로 변환하기 int -> List
         List<Integer> intList2 = new ArrayList<>();
         for (int element : nArr) {
             intList2.add(element);
         }


        String[] arr = { "A", "B", "C" };         // 배열 -> List로 변환

         List<String> list = Arrays.asList(arr);         // list 값 변경
         list.set(0, "D");
         System.out.println(Arrays.toString(arr)); // ["D", "B", "C"]
         System.out.println(list.get(0)); // D
         System.out.println(list.get(1)); // B
         System.out.println(list.get(2)); // C

    }
}
