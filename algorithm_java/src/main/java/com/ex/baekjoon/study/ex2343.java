package com.ex.baekjoon.study;

import java.io.IOException;
import java.util.Scanner;

/*
        보통 이분탐색은 정렬된 곳에서 찾는게 보통인데 해당 문제에서는 강의의 순서가 뒤바뀌면 안된다라고 적혀있다.
        따라서 정렬을 하지 않고 블루레이의 길이에 따라 만들어지는 강의의 수를 체크하여
        가장 최소의 길이가 되는 블루레이 크기를 구해야한다.
        지정한 블루레이 크기로 모든 레슨을 저장할 수 있는지 판단하여, 모두 저장할 수 있다면 크기를 줄이고,
        모두 저장할 수 없다면 블루레이 크기를 늘리는 방식으로 최솟값을 알 수 있다.

        이진탐색의 시작 인덱스 = 최대 길이의 레슨
        이진탐색의 종료 인덱스 = 모든 레슨 길이의 합
        ('시작인덱스 > 종료인덱스'일 때까지 수행)

        */

public class ex2343 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] A = new int[N];
            int start = 0;
            int end =0;
            for(int i=0; i<N; i++) {
                A[i] = sc.nextInt();
                if(start < A[i]) start = A[i]; // 시작 인덱스 저장 (A배열 중 최댓값)
                end = end + A[i]; // 종료 인덱스 저장 (A배열의 총합)
            }
//        start (시작 인덱스)
//        end (종료 인덱스)
            while(start <= end) {
                int middle = (start + end)/2; // 중간값
                int sum =0;
                int count =0;
                System.out.printf("s -> start:%d, end:%d, middle:%d \n",start,end, middle );
                for(int i=0; i<N; i++) {
                    if(sum + A[i] > middle) { // 중간값 보다 합계가 커졌을때, 카운트 세고 합계 초기화
                        //
                        count++;
                        sum =0;

                    }
                    sum = sum + A[i];
                    System.out.printf("ccc -> count:%d, sum:%d, middle:%d \n",count,sum, middle );
                }
                if(sum != 0) count++; // 합계가 더 있는거면, 남은걸 블루레이에 저장해야하므로 카운트 +1
                if(count > M) start = middle +1; // 주어진 M보다 count가 크면 중간값 +1을 길이 시작점으로 잡음
                else end = middle -1;            // 주어진 M보다 count가 같거나 작으면, 중간값 -1을 길이 끝점으로 잡음
                // 최종적으로 start가, end가 작아지면, 그때 start(중간값으로 각 합계구해가며 비교한 길이값) 시작점이 m개 블루레이를 구현할 수 있는 최저크기 가 된다.

            }
            System.out.println(start);
    }



}
