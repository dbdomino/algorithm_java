package com.ex.programmers;

import java.util.Arrays;

public class 가장큰수2 {
    public static void main(String[] args) {
        int[] arr = {6, 10, 2};
        // 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
        //예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
        //0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
        System.out.println(solution(arr));
    }

    public static String solution(int[] numbers) {
        String answer = "";
        StringBuilder result = new StringBuilder();

//        String[] arr = new String[numbers.length];// 숫자배열을 문자배열로 변환
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = String.valueOf(numbers[i]);
//        }
        // stream 으로 int -> String변환
        String[] strArray = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);


            /*
            Comparator의 compareTo
            Comparator를 사용하여 문자열을 붙여서 판단 후 내림차순 정렬해야한다.

            a.compareTo(b)는 a의 아스키 코드 값과 b의 아스키 코드를 비교하는 메서드이다.
            a는 기존에 존재하던 값을 의미하고 b는 새롭게 들어오는 값을 의미한다.
            이때 (a - b) > 0라면 양수가 반환되고 그 반대에는 음수가 반환, 값이 같을 때에는 0을 리턴한다.
            음수거나 0일 때에는 순서가 그대로 유지되지만 양수가 나오게 되면 두 값의 자리가 변경된다.
            (o2+o1) > (o1+o2) 여기서 +는 덧셈이 아니라 합치는 걸 의미한다.
            오름차순으로 정렬시 (o2 + o1).compareTo(o1 + o2)
            내림차순으로 정렬시 (o1 + o2).compareTo(o1 + o2)

            [3, 30, 34, 5, 9]를 비교하면 (o2 + o1).compareTo(o1 + o2)를 이용하여 비교하면 다음과 같은 결과가 나온다.

            o2 + o1 = 330 o1 + o2 = 303
            o2 + o1 = 3034 o1 + o2 = 3430
            o2 + o1 = 3034 o1 + o2 = 3430
            o2 + o1 = 334 o1 + o2 = 343
            o2 + o1 = 35 o1 + o2 = 53
            o2 + o1 = 345 o1 + o2 = 534
            o2 + o1 = 39 o1 + o2 = 93
            o2 + o1 = 349 o1 + o2 = 934
            o2 + o1 = 59 o1 + o2 = 95
             */
        // 문자열을 비교조건을 만들어 비교
        Arrays.sort(strArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
/*
//내림차순정렬
 Arrays.sort(str, new Comparator<String>() {
    @Override
    public int compare(String a, String b) {
         return (b+a).compareTo(a+b);
        //오름차순 정렬로 할거면 (o1+o2).compareTo(o1+o2);
        }
  });
 */
        // 0값이 중복일경우 ex){0,0,0}
        // 답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if (strArray[0].equals("0")) {
            return "0";
        }

        for (int i = 0; i < strArray.length; i++) {
            result.append(strArray[i]);
        }


        return result.toString();
    }
}
