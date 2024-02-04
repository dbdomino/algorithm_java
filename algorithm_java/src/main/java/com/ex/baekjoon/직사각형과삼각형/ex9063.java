package com.ex.baekjoon.직사각형과삼각형;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ex9063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()) ;
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(st.nextToken());
        int[] arrX = new int[n]; // 여기서 최대 값 하나 최소값 하나 찾으면된다.
        int[] arrY = new int[n];

        int xmin=Integer.MAX_VALUE, xmax=0, ymin=Integer.MAX_VALUE, ymax=0;

        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine()) ;
            arrX[i] = Integer.parseInt(st.nextToken());
            arrY[i] = Integer.parseInt(st.nextToken());
//            if (xmin > arrX[i]) xmin = arrX[i];
//            if (xmax < arrX[i]) xmax = arrX[i];
//            if (ymin > arrY[i]) ymin = arrY[i];
//            if (ymax < arrY[i]) ymax = arrY[i];

            xmax = Math.max(xmax, arrX[i]);
            xmin = Math.min(xmin, arrX[i]);
            ymax = Math.max(ymax, arrY[i]);
            ymin = Math.min(ymin, arrY[i]);
        }
        Arrays.sort(arrX);
        Arrays.sort(arrY);

        System.out.print((arrX[n - 1] - arrX[0]) * (arrY[n - 1] - arrY[0]));
//        bw.write(String.valueOf((xmax-xmin)*(ymax-ymin)));
        bw.flush();



        br.close();
        bw.close();
    }
}
