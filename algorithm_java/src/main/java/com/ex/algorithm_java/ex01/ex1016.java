package com.ex.algorithm_java.ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long min = Long.parseLong(st.nextToken());
        long max = Long.parseLong(st.nextToken());
// 어떤 정수 X가 1보다 큰 제곱수로 나누어 떨어지지 않을 때, 그 수를 제곱ㄴㄴ수라고 한
//  min과 max가 주어지면, min보다 크거나 같고, max보다 작거나 같은 제곱ㄴㄴ수가 몇 개 있는지 출력한다.
        // ㄴㄴ 제곱수는 4 9 16 25 같은 수로 나누면 나머지가 나오는 수
/**
 * 1. 에라토스테네스의 체 알고리즘을 통해 제곱 수들을 true로 변경해주고, 입력받은 min, max 사이의 값 중 false로 유지된 수의 개수를 구하여 문제를 해결할 수 있다.
 * 2. 가장 초기에 min, max 값을 입력받고 max - min + 1을 통해 실제 확인해야 하는 수의 개수를 구하여 size에 할당한다.
 * 3. i를 2로 초기화해주고 i의 제곱수가 max보다 커질 때까지 아래와 같은 작업을 반복 수행한다.
 *   - i의 제곱 수를 구해 value에 할당한다.
 *   - 만약 min을 value로 나누었을 때 나누어 떨어지면 remain에 0을, 그렇지 않으면 1을 할당한다.
 *   - min을 value로 나눈 몫과 remain을 더하여 data에 할당함으로써 현재 제곱 수에 대하여 어느 값부터 확인할지 정한다.
 *   - value와 data의 곱이 max보다 커질 때까지 제곱수들의 visited(false) 값을 true로 변경하고 size를 1 감소시키고, data를 1씩 증가시킨다.
 *   - 한 작업이 끝날 때마다 다음 제곱 수를 확인해야하므로 i를 1씩 증가시킨다.
 */

        long size = max-min + 1;

        boolean[] checkArr = new boolean[(int)size];
        long i = 2;
        while (i * i <= max) {
            long value = i * i;
            int remain = 0;
            if (min % value != 0) {
                remain = 1;
            }

            long data = (min / value) + remain; // 몫을 가지고 제곱수와 곱해서 비교처리
            while (value * data <= max) {
                if (!checkArr[(int)(value * data - min)]) {
                    checkArr[(int)(value * data - min)] = true;
                    size -= 1;
                }
                data += 1;
            }

            i += 1;
        }
        System.out.println(size);

        /* 시간초과
        long cnt = 0;
        for (long i= min; i <=max ; i++){
            if (check(i)) cnt++;
        }
        System.out.println(cnt);*/

        br.close();
    }

    private static boolean check(long i) {

        for (int j = 2; (long) j * j <= i; j++) {
            long pow = (long) j * j;
            if (i % pow == 0) return false;
        }
        return true;
    }
}
