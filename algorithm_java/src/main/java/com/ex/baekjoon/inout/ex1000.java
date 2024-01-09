package com.ex.baekjoon.inout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
2가지 입력방법을 이용하여 풀이한다.
출력에서 System 클래스 ( System.out.println() ) ,BufferedReader , StringBuilder, StringBuffer 을 이용해왔다.
이와 반대로 입력 방법 또한 여러가지가 있다.
 백준 알고리즘을 해결하기 위한 대표적인 입력 방법 두 가지를 쓰면서 풀이해보고자 한다.
1. Scanner 클래스를 쓸 것이다

https://st-lab.tistory.com/41 필독
 */
public class ex1000 {
    public static void main(String[] args) throws IOException {
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(a+b);

 */

        /*
굳이 String 변수 생성 안하고 입력과 동시에 구분자로 분리해줘도 된다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		System.out.println(a+b);

*/

/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();

        System.out.println(n+m);
*/
    }

}
class ex1000_1 {
    void run() {
        //Scanner 객체명 = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
/*

        String 문자열_space = in.next(); // in.next() : 문자열 입력시 공백 전 까지만 받음
        String 문자열_Enter = in.nextLine(); // in.nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
        boolean 부울 = in.nextBoolean();

        byte 바이트 = in.nextByte();
		short 쇼트 = in.nextShort();
		int 정수 = in.nextInt();
		long 롱 = in.nextLong();

		double 더블형 = in.nextDouble();
		float 플롯 = in.nextFloat();
 */
        String space = in.next();

    }

}
class ex1000_2 {
    void run() {
        //BufferedReader 을 쓰는 방식이다. BufferedWriter 와 객체 생성 방법이 매우 유사하다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
/*

        String 문자열_space = in.next(); // in.next() : 문자열 입력시 공백 전 까지만 받음
        String 문자열_Enter = in.nextLine(); // in.nextLine() : 문자열 입력시 Enter 입력 전까지만 받음
        boolean 부울 = in.nextBoolean();

        byte 바이트 = in.nextByte();
		short 쇼트 = in.nextShort();
		int 정수 = in.nextInt();
		long 롱 = in.nextLong();

		double 더블형 = in.nextDouble();
		float 플롯 = in.nextFloat();
 */
//        String space = in.next();

    }

}
