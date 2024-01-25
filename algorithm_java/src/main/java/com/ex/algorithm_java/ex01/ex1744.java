package com.ex.algorithm_java.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
탐욕 알고리즘(Greedy algorithm)은 최적해를 구하는 데에 사용되는 근사적인 방법으로,
여러 경우 중 하나를 결정해야 할 때마다 그 순간에 최적이라고 생각되는 것을 선택해
나가는 방식으로 진행하여 최종적인 해답에 도달한다.

길이가 N인 수열이 주어졌을 때, 그 수열의 합을 구하려고 한다.
하지만, 그냥 그 수열의 합을 모두 더해서 구하는 것이 아니라, 수열의 두 수를 묶으려고 한다.  요구조건 특이해
어떤 수를 묶으려고 할 때, 위치에 상관없이 묶을 수 있다.       (묶는 기준은 정렬과 상관없다.)
하지만, 같은 위치에 있는 수(자기 자신)를 묶는 것은 불가능하다. (중복으로 두개값 묶는건 안됨)
그리고 어떤 수를 묶게 되면, 수열의 합을 구할 때 묶은 수는 서로 곱한 후에 더한다. 꼭 이래야돼? (묶은 경우 반드시 곱해야 한다.)
예를 들면, 어떤 수열이 {0, 1, 2, 4, 3, 5}일 때, 그냥 이 수열의 합을 구하면 0+1+2+4+3+5 = 15이다.
하지만, 2와 3을 묶고, 4와 5를 묶게 되면, 0+1+(2*3)+(4*5) = 27이 되어 최대가 된다. (왜 어떤건 묶어서 곱하고 어떤건 묶어서 곱하지 않는데)

수열의 모든 수는 단 한번만 묶거나, 아니면 묶지 않아야 한다. // 걍 지맘데로네 그래서 그리디 알고리즘이라고 판단하는건가
수열이 주어졌을 때, 수열의 각 수를 적절히 묶었을 때, 그 합이 최대가 되게 하는 프로그램을 작성하시오.
(음수는 음수끼리 곱하기, 양수는 양수끼리 곱하기, {1이 포함되면 더하기}
음수가 하나 남았으면-> 0이 남았다면 0이랑 곱하기, 0이 안남았다면 최소양수랑 더하기
음수가 없으면 -> 그냥 더하기
0이랑 음수하나 남았으면 0이랑 곱하기
0이랑 양수하나 남았으면 0이랑 더하기
 */
public class ex1744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // n이 홀수인지 짝수인지 보장이안됨. 또한 짝이 이루어질 필요가없음.
        int[] arr = new int[n];
        int sum = 0;
        int minus = 0; // 음수, 0포함, 음수개수 구해서 반복돌릴거임
        int plus = 0;

        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] <= 0) {
                minus++;
            }
        }
        Arrays.sort(arr);

        if (minus % 2 == 1) { // 음수가 홀수개면? 음수(0포함) 의 마지막 하나 값(0이나 음수) 이므로 더하기가 젤나음
            sum+= arr[minus-1];
        }

        // 음수와 0을 합쳐서 구분 2개씩 짝지어가면서 곱하기
//        for (int i= 0; i < minus ; i += 2) { // minus개수가 1개일때 i가 0부터 시작하면 에러난다.
        for (int i= 1; i < minus ; i += 2) { // 이를 방지하기 위해 i를 1부터 시작하도록해서 minus한개일때 for 안돌도록 수정
            // 첫번째값은 무조건 음수, 곱해서 양수가 되는지 확인, 곱해서 0이면 두번째값이 0이란 소리
            if (arr[i-1] * arr[i] >= 0) {
                sum+= arr[i-1] * arr[i];
            } else {// 곱해서 양수가 안되면 두번째값이 0이라는 소리, 더하기
                sum+= arr[i-1] + arr[i];
            }
        }

        // 양수가 홀수 개일 경우, 제일 작은 양수= minus index 위치의 양수 걍 더하기
        if ((n - minus) % 2 == 1) {
            sum += arr[minus];
        }
        // 양수를 구분, 양수는 끝에서부터 곱해나가는게 더 유리하다만, 양수가 짝수일 경우, 1이 들어갈때는 더하는게 더 낫다.
        // 그러므로 더한것과 큰것 중 더큰수를 내뱉자
        for (int i= n-1; i > minus ; i -= 2) {
            int mul = arr[i] * arr[i - 1];
            int add = arr[i] + arr[i - 1];
            if (mul > add) {
                sum += mul;
            } else {
                sum += add;
            }
        }

        System.out.println(sum);
        br.close();
    }
}