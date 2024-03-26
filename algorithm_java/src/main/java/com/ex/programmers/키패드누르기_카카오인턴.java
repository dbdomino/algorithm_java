package com.ex.programmers;

import java.util.ArrayList;
import java.util.List;

public class 키패드누르기_카카오인턴 {
    public static void main(String[] args) {
//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
//        String hand = "right";
        String hand = "left";

        // 엄지 손가락 각각 처음위치 *, #
        // 번호 누른다면 눌렀을 때 손가락위치는 그대로 거기 있는다.
        // 각 번호 위치를 배열로 잡고, 왼손과 오른손의 위치 비교를 인덱스로 할 수 있을 것 같다.
        // 가운데번호일 경우 위치번호 주기

        int leftLocation=10; // 처음위치 *
        int rightLocation=12; // 처음위치 #

        int[][] keybord = {{1,4,7,10},{2,5,8,0},{3,6,9,12}};


        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftLocation = number;
            } else if (number == 3|| number == 6 || number == 9) {
                sb.append("R");
                rightLocation = number;
            } else {
                if (number == 0) number=11;
                int leftDiff = (Math.abs(number - leftLocation) / 3) + (Math.abs(number - leftLocation) % 3);
                int rightDiff =(Math.abs(number - rightLocation) / 3) + (Math.abs(number - rightLocation) % 3);

                if (leftDiff == rightDiff){
                    if ("left".equals(hand)){
                        sb.append("L");
                        leftLocation = number;
                    }else {
                        sb.append("R");
                        rightLocation = number;
                    }
                } else if (leftDiff > rightDiff){
                    sb.append("R");
                    rightLocation = number;
                } else {
                    sb.append("L");
                    leftLocation = number;
                }
            }
            System.out.println("left "+ leftLocation);
            System.out.println("right "+ rightLocation);
            System.out.println("----");

        }
        System.out.println(sb);
        // LRLLRRLLLRR
    }

    public String solution(int[] numbers, String hand) {
        int leftLocation=10; // 처음위치 *
        int rightLocation=12; // 처음위치 #

        int[][] keybord = {{1,4,7,10},{2,5,8,0},{3,6,9,12}};


        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            if (number == 1 || number == 4 || number == 7) {
                sb.append("L");
                leftLocation = number;
            } else if (number == 3|| number == 6 || number == 9) {
                sb.append("R");
                rightLocation = number;
            } else {
                if (number == 0) number=11;
                int leftDiff = (Math.abs(number - leftLocation) / 3) + (Math.abs(number - leftLocation) % 3);
                int rightDiff =(Math.abs(number - rightLocation) / 3) + (Math.abs(number - rightLocation) % 3);

                if (leftDiff == rightDiff){
                    if ("left".equals(hand)){
                        sb.append("L");
                        leftLocation = number;
                    }else {
                        sb.append("R");
                        rightLocation = number;
                    }
                } else if (leftDiff > rightDiff){
                    sb.append("R");
                    rightLocation = number;
                } else {
                    sb.append("L");
                    leftLocation = number;
                }
            }

        }
        String answer = sb.toString();
        return answer;
    }
}
