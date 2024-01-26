package com.ex.algorithm_java.ex01;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

/* 그리디, priority 큐
 각 묶음의 카드의 수를 A, B라 하면 보통 두 묶음을 합쳐서 하나로 만드는 데에는 A+B 번의 비교를 해야 한다.
 매우 많은 숫자 카드 묶음이 책상 위에 놓여 있다.
 이들을 두 묶음씩 골라 서로 합쳐나간다면, 고르는 순서에 따라서 비교 횟수가 매우 달라진다.
 예를 들어 10장, 20장, 40장의 묶음이 있다면 10장과 20장을 합친 뒤, 합친 30장 묶음과 40장을 합친다면 (10 + 20) + (30 + 40) = 100번의 비교가 필요하다.
 그러나 10장과 40장을 합친 뒤, 합친 50장 묶음과 20장을 합친다면 (10 + 40) + (50 + 20) = 120 번의 비교가 필요하므로 덜 효율적인 방법이다.

N개의 숫자 카드 묶음의 각각의 크기가 주어질 때, 최소한 몇 번의 비교가 필요한지를 구하는 프로그램을 작성하시오.
 */
public class ex1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < n; i++){
            pq.add(sc.nextInt());
        }

        //우선순위 큐에 2개이상 들어있어야 비교가 가능하다.
        int answer = 0;
        while (pq.size() > 1) {
            int temp1 = pq.poll(); // .poll() socket / pipe 등에서 동시에 여러개의 I/O를 대기할 경우에 특정한 fd에 blocking되지 않고 I/O를 할 수 있는 상태인 지를 모니터링하여 I/O 가능한 상태의 fd인지를 검사하는 함수
            int temp2 = pq.poll(); // 꺼내기 이며 빈값을 꺼낼경우 null로 리턴

            answer += temp1 + temp2;
            pq.add(temp1 + temp2); //합한 묶음 다시 넣기
        }
        System.out.println(answer);
        // stack은 st.push("2"); 넣기 st.pop(); 꺼내기
        // quque는 q.offer("0"); 넣기 q.poll(); 꺼내기

/*
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int answer = 0;
//        Integer[] arrI = Arrays.stream(arr).boxed().toArray(); // 안됨.
//        Integer[] arrI =  (Integer[])  Arrays.stream(arr).boxed().toArray( );
//        Integer[] arrI = (Integer[]) Arrays.stream(arr).boxed().toArray();// 안됨, 런타임 에러, class [Ljava.lang.Object; cannot be cast to class [Ljava.lang.Integer;
//        Integer[] arrI2 = Arrays.stream(arr).mapTo().toArray(Integer[]::new);
        Arrays.sort(arr);
//        Arrays.sort(arrI, Collections.reverseOrder());// 내림차순 정렬, int[] 배열은 Integer 배열로 변경해서 써야한다.
        for(int i = 0; i < n-1; i++){
            System.out.printf("before arr[%d] : %d, arr[%d] : %d %n",i, arr[i], i+1, arr[i+1]);
            int s = arr[i] + arr[i+1];
            arr[i+1] = s;
            answer += s;
            System.out.printf("answer %d%n",answer);
            System.out.printf("after arr[%d] : %d, arr[%d] : %d %n",i, arr[i], i+1, arr[i+1]);
        }

//        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
*/

    }

}
