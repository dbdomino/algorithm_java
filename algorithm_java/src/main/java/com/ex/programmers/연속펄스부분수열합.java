package com.ex.programmers;

// DP 를 활용하는 문제
public class 연속펄스부분수열합 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -6, 1, 3, -1, 2, 4};
        System.out.println(solution(arr));
    }

    public static long solution(int[] sequence) {
        long answer = 0;

        int cnt = 0;
        boolean flag = true;

        int sum = 0;

        long purse_sum1 = 0; // [1, -1, 1, -1, ....] 비교
        long purse_sum2 = 0; // [-1, 1, -1, 1, ....] 비교

        //1. [1, -1, 1, -1...]을 순서대로 곱하는 부분 수열의 합을 기록하기(purse_sum1)
        //2. [-1, 1, -1, 1 ...]을 순서대로 곱하는 부분 수열의 합을 기록하기(purse_sum2)
        //3. sequence를 완전 탐색 하면서 값에 펄스 부분 수열을 곱하여 purse1, purse2에 더해주기(핵심)
          /**해당 문제에서 생각해야 할 부분은 연속 수열에서만 부분 수열의 합을 구하는 게 아닌 펄스 수열을 곱하고 그중에서 가장 큰 합을 구하고 또한 펄스 수열은 [1, -1, 1...] 혹은 [-1, 1, -1...] 두 가지를 생각해야 한다는 점이다.
          //가장 큰 핵심은 부분 수열의 합이 절대 0보다 작을 수 없다는 것이다.
          //이유는 수열 중에 원소를 하나만 가져온다면 음수, 0, 양수가 나올 수 있는데 이때 음수는 -1을 곱하면 양수가 되기 때문에 절대 답이 0보다 작을 수 없다.
**/
        //4. purse_sum1 , purse_sum2가 0보다 작아지면 0으로 만들어 주기(0보다 작을 수 없기 때문에)
        //5. purse1이나 purse2가 answer보다 커지면 answer 변경해 주기

        for (int i : sequence) {
            purse_sum1 += flag ? i : -i; // 두가지 경우를 나눠 펄스를 곱한 듯이 나타내기위해
            purse_sum2 += flag ? -i : i;

            // 음수일 경우 그냥 0으로 넣기,
            purse_sum1 = Math.max(0, purse_sum1);
            purse_sum2 = Math.max(0, purse_sum2);

            // 계속 펄스로 곱한걸 합한 purse_sum들과 answer과 비교하여 큰것을 출력
            answer = Math.max(answer, Math.max(purse_sum1, purse_sum2));

            flag = !flag;
        }
        return answer;
    }
}
