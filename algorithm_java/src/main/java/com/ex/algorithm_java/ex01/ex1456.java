package com.ex.algorithm_java.ex01;

import java.util.Scanner;

// 어떤 수가 소수의 N제곱(N ≥ 2) 꼴일 때, 그 수를 "거의 소수"라고 한다.     소수^n = 어떤수 = 거의 소수
// 두 정수 A와 B가 주어지면, A보다 크거나 같고, B보다 작거나 같은 거의 소수가 몇 개인지 출력한다.
// 범위 안의 어떤수=거의소수=소수^n 이 되는 수의 개수를 구하자.
// [에락토스테네스의 체]
// 구현방식: N크기의 배열을 만들어 각 수의 배수를 소수가 아님(false)을 저장
// i가 N에 도달할때까지 j가 2*i부터 시작하여 N까지 탐색
public class ex1456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long min = sc.nextLong(); // 최소값
        long max = sc.nextLong(); // 최대값
        primeNumFind f =new primeNumFind(min,max);
        f.find();

        sc.close();
    }
    static class primeNumFind {
        long max;
        long min;
        boolean[] IsNotPrime;
        int[] primeNum;

        primeNumFind(long min, long max) {
            this.max = max;
            this.min = min;
        }
        void find() {
            int cntPrime=0;
            primeNum=new int[10000001];// 소수를 넣음
            IsNotPrime = new boolean[10000001]; // 소수가 아닌걸 넣음.

            for (int i = 2; i <10000001; i++) {
                if (IsNotPrime[i]) {
                    i++;
                } else {
                    primeNum[cntPrime++] = i;
                    //a.add(i);
                    for (int j = 2; j <= 10000000; j++) {
                        if (i * j >= 10000000) break;
                        IsNotPrime[i * j] = true;
                    }
                    if (i != 2) i++;
                }
            }

            int cnt = 0;
            for (int k : primeNum) {
                if(k==0) break;
                long n = k;
                while (k <= max / n) {
                    if (k * n >= min) cnt++;
                    n = n * k;
                }
            }
            System.out.println(cnt);
        }
    }
}
