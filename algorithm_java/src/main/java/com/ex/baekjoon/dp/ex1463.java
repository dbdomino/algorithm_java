package com.ex.baekjoon.dp;

import java.util.Scanner;

public class ex1463 {
    public static int[] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cnt = 0;
        sc.close();

        dp = new int[a + 1];
//        dp[0] = 0;
//        dp[1] = 0;
//        for (int i = 2; i <= a; i++){
//            dp[i] = dp[i-1] + 1;
//            if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
//            if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
//        }
//        System.out.println(dp[a]);

//        while (a != 1) {
//            cnt++;
//            if (a % 3 == 0) a /= 3;
//            else if (a % 2 == 0) a /= 2;
//            else a -= 1;
//        }
        System.out.println(calculate(a));
    }
    public static int calculate(int number){
        if (number == 1){
            return 0;
        }
        if (dp[number] > 0){
            return dp[number];
        }
        dp[number] = calculate(number-1) + 1;
        if (number%3 == 0) {
            dp[number] = Math.min(dp[number],calculate(number/3) +1);
        }
        if (number%2 == 0) {
            dp[number] = Math.min(dp[number],calculate(number/2) +1);
        }
        return dp[number];
    }
    /*
    접근 과정
1. 어떤 문제로 이해 했는가? 그리고 문제의 제약 조건은?
임의의 숫자 (10^6보다 작음) 가 주어지면, 그 숫자를 3으로 나누거나 2로 나누거나 1을 빼서
1로 만드는 문제이다.

2. 나의 방식대로 문제를 재정의 하자.
d[n]에 n을 1로 만들기 위한 최소 개수를 저장하고, d[number]를 구한다.

3. 어떤 알고리즘과 자료구조를 사용할 것인가?
재귀함수 (Top-down)이나 반복문(Bottom-UP)을 사용할 계획이다.

4. 어떻게 계산할 것인가?
1) 입력
BufferedReader를 사용해 입력받을 것이다.

2) 시간 복잡도 계산
최악 = O(N) 처음부터 끝까지 1씩 빼는경우.

5. 주의할 점은 무엇인가?
3나누기 => 2나누기 => 1빼기의 순으로 처리하면 안됨!

6. 풀이 과정
처음에는 반복문을 통해 number를 3부터 나누고 (왜냐면 제일 빨리 작아질거라고 생각해서)
2로 나눈뒤에
1을 빼려고했다.
그렇게 하니까 10에서 바로 예외케이스가 발생했다.

10 = 10/2=>5-1=>4/2=>2-1=>1 의 4번으로 구할 수도 있지만,
10 = 10-1=>9/3=>3/3=?1 의 3번으로도 구할 수 있었고, 이때 마이너스 연산을
가장 먼저 수행했기 때문에 내가 세운 규칙과는 맞지 않았다.

어떻게 할지 막막해서 힌트를 찾아보니,
점화식을 이용한 다이나믹 프로그래밍 문제였다.
다이나믹 프로그래밍을 위해서는 방식이 2가지가 있는데, Top-Down방식과
Bottom-UP 방식이 있었다.

Top- down은 재귀를 이용해서 계산하는 방식이고,
Bottom-UP은 반복문을 이용해서 계산하는 방식인데, 둘다 공통적으로 d[]라는

메모 배열을 만들어서 그곳에 계산 결과를 저장해놓고 사용했으며,
작은 문제들을 연결해서 큰 문제를 해결하는 방식을 취하고 있었다.

dp[number] = number를 1로 만들기 위한 최소 횟수
예외처리 (0과 1) => 변환할 필요가 없다.
반복문은 2부터 number까지 진행.
dp[number]를 구하려면, 연산이 3가지가 진행 가능한데

첫번째가 1을 빼는것.
dp[number]  ====1회====> dp[number-1] ========> 1 이므로
dp[number-1]에서 1을 더해준다.
마찬가지로 2로 나누는 경우에는
dp[number] ====1회====> dp[number/2] ========> 1이므로
dp[number/2]에서 1을 더해준다.

이후 그 셋중에서 가장 작은값!을 dp[number]에다가 취해주면 된다.
https://odysseyj.tistory.com/19
     */
}
