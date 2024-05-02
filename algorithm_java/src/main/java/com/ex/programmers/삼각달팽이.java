package com.ex.programmers;

public class 삼각달팽이 {
    public static void main(String[] args) {
        System.out.println(solution(3));
    }

    public static int[] solution(int n) {
        int[][] triangle = new int[n][n]; // 2차원 배열 먼저 만듬.
        int v = 1; // 채워넣는 숫자

        //숫자 위치
        int x = 0;
        int y = 0;

        // 왼쪽아래 이동 -> 오른쪽으로 이동 -> 왼쪽 위로 대각선방향 이동 -> 왼쪽 아래로 이동 .... 반복하며 다 채워야 함.
        while(true){
            //왼쪽아래로 이동
            while (true) {
                triangle[y][x] = v++;
                if (y + 1 == n || triangle[y+1][x] != 0) break;
                y +=1;
            }
            if (x + 1 == n || triangle[y][x+1] != 0) break;
            x += 1;

            // 오른쪽으로 이동
            while (true) {
                triangle[y][x] = v++;
                if (x + 1 == n || triangle[y][x+1] != 0) break;// 둘중 하나라도 걸리면 반복 끝
                x +=1; // 반복을 위해 x증가 = 오른쪽으로 이동
            }
            if(triangle[y-1][x-1] != 0) break;
            x -= 1;
            y -= 1;

            // 왼쪽 위로 이동
            while(true) {
                triangle[y][x] = v++;
                if(triangle[y-1][x-1] != 0) break; // 다음께 0이 아니면 이미 한거라서 반복끝
                x -= 1; // 대각선으로 이동
                y -= 1;

            }
            if (y+1 == n || triangle[y+1][x] != 0) break;
            y += 1;
        }


        int[] result = new int[v-1];
        int index = 0;
        for (int i = 0; i<n; i++) { // 오... 이러면 2차원배열 삼각형을 1차원배열로 옮길 수 있네
            for (int j = 0; j <= i; j++){
                result[index++] = triangle[i][j];
            }
        }

        return result;
    }
}
