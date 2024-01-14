package com.ex.algorithm_java.ex01;

import java.util.*;

// 주의, 배열 A와 B의 인덱스는 1부터 시작한다.
// https://fseakf.tistory.com/55
public class ex1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
/*
//        int[][] A=new int[n][n];
//        List<Integer> B = new ArrayList<>(n*n);
        int[] Barr = new int[n*n];
        for (int i =0; i< n; i++) {
            for (int j = 0; j < n; j++) {
                int r = (i+1)*(j+1);
//                A[i][j] = r;
                Barr[(i*n+j)] = r;
            }
        }
        // 오름차순으로 정렬        Collections.sort(list);
//        Collections.sort(B);
//        B.sort(Comparator.naturalOrder()); // jdk 8 이후
        Arrays.sort(Barr);

        // 내림차순으로 정렬        Collections.sort(list, Collections.reverseOrder());
//        Collections.sort(B, Collections.reverseOrder());
//        B.sort(Comparator.reverseOrder());
//        Arrays.sort(Barr, Comparator.reverseOrder()); // 내림차순
//        System.out.println(B.toArray()[k]);
        System.out.println(Barr[k1]); // 인덱스는 1부터시작
  */
  // 이분탐색으로 풀기
/*
// 이분 탐색
// B[K] = x에 대해 x 는 left <= x < right 안의 수다.
        while(left < right) {
            mid = (left + right) / 2;	// 임의의 x를 left 와 right의 중간 값으로 잡는다.
            for(int i = 1; i <= N; i++) {
                count += mid / i;	// 각 단별 mid 보다 작거나 같은 수의 개수 합을 구한다.
            }
            // 임의의 x(mid)보다 작거나 같은 수의 개수(count)와 K의 값을 비교
            if(count < K) {
                // 하한 경계선(수의 범위 중 left)을 높인다.
            }
            else {
                // 상한 경계선(수의 범위 중 right)을 낮춘다.
            }
        }

 */
        // x는 lo <= x <= hi 의 범위를 갖는다.
        long lo = 1;
        long hi = k;

        // lower-bound
        while(lo < hi) {

            long mid = (lo + hi) / 2;	// 임의의 x(mid)를 중간 값으로 잡는다.
            long count = 0;

            /*
             *  임의의 x에 대해 i번 째 행을 나눔으로써 x보다 작거나 같은 원소의 개수
             *  누적 합을 구한다.
             *  이 때 각 행의 원소의 개수가 N(열 개수)를 초과하지 않는 선에서 합해주어야 한다.
             */
            for(int i = 1; i <= n; i++) {
                count += Math.min(mid / i, n);
            }

            // count가 많다는 것은 임의의 x(mid)보다 작은 수가 B[K]보다 많다는 뜻
            if(k <= count) {
                hi = mid;
            }
            else {
                lo = mid + 1;
            }
        }

        System.out.println(lo);

    }
}
