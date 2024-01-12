package com.ex.programmers;

public class knights {
    public static void main(String[] args) {

    }

}
class Solution {
    /*
    각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다.
    단, 이웃나라와의 협약에 의해 공격력의 제한수치를 정하고,
    제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 공격력을 가지는 무기를 구매해야 합니다.
     */
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for(int i=1;i<=number;i++){
            // 기사 한명당 공격력(약수) 구하기
            int cnt = 0;
            for(int j=1;j*j<=i;j++){
                if(j*j==i) cnt++;   //
                else if(i%j==0) cnt+=2;  // i 약수 중 하나가 j 라고 했을 때, 다른 약수는 i / j 가 되므로 하나의 약수를 알면 다른 하나의 존재가 보장된다.
            }

            if(cnt>limit) cnt = power; // 공격력 제한 높으면 제한된공격력만큼만 쓰기
            answer += cnt;
        }

        return answer;
    }

    // 약수를 구하는 알고리즘

}
