package com.ex.baekjoon.집합과맵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class ex1269 {
    public static void main(String[] args) throws IOException {
        /*
        자연수를 원소로 갖는 공집합이 아닌 두 집합 A와 B가 있다.  // 공집합?
        이때, 두 집합의 대칭 차집합의 원소의 개수를 출력하는 프로그램을 작성하시오.  // 차집합? 대칭차집합?
        두 집합 A와 B가 있을 때, (A-B)와 (B-A)의 합집합을 A와 B의 대칭 차집합이라고 한다.
        예를 들어, A = { 1, 2, 4 } 이고, B = { 2, 3, 4, 5, 6 } 라고 할 때,  A-B = { 1 } 이고, B-A = { 3, 5, 6 } 이므로,
        대칭 차집합의 원소의 개수는 1 + 3 = 4개이다.
        자바로 차집합을??
        이 문제에서는 2개의 집합 A, B가 주어진다. 그리고 A-B와 B-A 사이즈의 합을 더하면 된다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        // set 에 값 넣기
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < a; i++) {
            setA.add(Integer.parseInt(st.nextToken()));
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < b; i++) {
            setB.add(Integer.parseInt(st.nextToken()));
        }


        int ans = 0;
        for(int num : setA) {
            if(!setB.contains(num)) {
                ans += 1;
            }
        }
        for(int num : setB) {
            if(!setA.contains(num)) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
