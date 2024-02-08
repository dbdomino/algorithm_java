package com.ex.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 기
// 이 문제는 대부분 Arrays.sort 로 풀면 시간초과가 난다.
// , 최악의 경우에도 O(nlogn) 을 보장하거나 혹은, O(n) 에 가까운 정렬 알고리즘을 사용해야 한다
// 병합 정렬, 힙 정렬, 카운팅정렬을 사용해야하나, collection의 sort를 이용해서도 가능하다. 이게더빠르다.
public class ex2751 {
    public static void main(String[] args) throws IOException {
// 첫 번째는 Collections.sort() 를 쓰는 방법
       /* Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);*/

// 2번째 방법으로 Counting sort (카운팅 정렬)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
		/*
		  -1000000 ~ 1000000
		  기준점 0 = index 1000000 으로 생각
		*/
        boolean[] arr = new boolean[2000001];

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000] = true;   // 위아래로 정렬해가며
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i]) {
                sb.append((i - 1000000)).append('\n');
                System.out.println((i - 1000000) + " " +arr[i]);
            }
        }
        System.out.print(sb);
    }
}
