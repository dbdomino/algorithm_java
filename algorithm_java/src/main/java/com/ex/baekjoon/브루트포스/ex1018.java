package com.ex.baekjoon.브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1018 {
    public static void main(String[] args) throws IOException {
// M×N 크기의 보드를 찾았다. 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
// 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
        // 보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에
        // 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
        // 당연히 8*8 크기는 아무데서나 골라도 된다.
        //
        // 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.

        // 어디서 잘라야 최적일지 구하는거네.
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = n*m/64;
        int W = 0;
        int B = 0;
        for(int i =0; i<n ; i++){
            String str = br.readLine();
            for(int j = 0; j<m ; j++) {
                char c_str=str.charAt(j);
                if(c_str == 'W') { W++;}
                else if(c_str == 'B') { B++;}
            }
        }

        int result = 0;

        W = W-32*count;
        B = B-32*count;
        if (0 <= B && 0<= W) {result = 0;}
        else if (0 <= B && 0 > W) {result = -W;}
        else if (0 > B && 0 <= W) {result = -B;}


        System.out.println(result);

        br.close();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        //입력 보드
        String[] arr = new String[N];
        //흰보드와 검은보드
        String[] Wboard = new String[8];
        String[] Bboard = new String[8];

        //입력보드에 입력값 저장
        for(int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        //흰보드 만들기
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) Wboard[i] = "WBWBWBWB";
            else Wboard[i] = "BWBWBWBW";
        }

        //검은보드 만들기
        for(int i = 0; i < 8; i++) {
            if(i % 2 == 0) Bboard[i] = "BWBWBWBW";
            else Bboard[i] = "WBWBWBWB";
        }

        //모든 경우의 수중 제일 작은 값을 저장할 변수. 최솟값을 비교하기 위해서 나올 수 있는 제일 큰 값을 저장.
        //8x8이기때문에 64가 제일 나올 수 있는 큰 수 이다.
        //(완전 다른 두 보드를 비교하기 때문에 사실상 유효한 수는 절반인 32이다.)
        int min = 64;

        //보드르 비교하기 위한 for문 4개.
        for(int i = 0; i < (N - 7); i++) { // 어디서 자를 지 위치에 따라서 경우의 수로 모두 비교하기 위해
            for(int j = 0; j < (M - 7); j++) {
                int Wcount = 0;
                int Bcount = 0;

                for(int k = 0; k < 8; k++) { // 비교하면서 흰보드일지 검은보드일지 에 따라 칠해야할 수를 구하고, 그중 최소를 뱉는다.
                    for(int l = 0; l < 8; l++) {
                        if(Wboard[k].charAt(l) != arr[k + i].charAt(l + j)) Wcount++;
                        if(Bboard[k].charAt(l) != arr[k + i].charAt(l + j)) Bcount++;
                    }
                }
                min = Math.min(min, Math.min(Wcount, Bcount)); // 지금껏 구한 최소들과 비교해서 가장 최소인 것을 저장한 뒤 나중에 출력
//                System.out.println("i= "+i+" , j= "+j + " , answer = "+min);
            }
        }
        System.out.println(min);
    }
}
