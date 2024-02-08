package com.ex.baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

// 배열 2차원배열 정렬
public class ex11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] xarr= new int[n];
        int[] yarr= new int[n];
        int[][] arr= new int[n][2];

        StringTokenizer st;
        // 좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
        for (int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
//            xarr[i] = Integer.parseInt(st.nextToken());
//            yarr[i] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //  Arrays.sort() 자체는 2차원 배열의 정렬을 할 수가 없다.
        //  그렇기 때문에 람다식을 사용하여 Arrays.sort() 확장할 수 있어야한다.
/*방법1
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] e1, int[] e2) {
                if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
                    return e1[1] - e2[1];
                }
                else {
                    return e1[0] - e2[0];
                }
            }
        });*/
Arrays.sort(arr, (e1, e2) -> {
   if(e1[0] == e2[0]) { // e1 e2의 첫번째인자가 같다면
       return e1[1] - e2[1]; // e1 e2의 두번째 인자를 가지고 비교
   } else {
       return e1[0] - e2[0]; // e1 e2의 첫번째 인자로 비교
   }
});

        for (int i=0; i<n;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
