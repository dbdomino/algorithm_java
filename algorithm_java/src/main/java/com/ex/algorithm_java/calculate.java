package com.ex.algorithm_java;

public class calculate {

}
class arithmetic {



    public static void main(String[] args) {
        Al a = new Al();
        a.run();
    }
}
class Al{
    // 간편 덧셈 뺄샘
    void run() {
        int a = 10;
        int b = 4;

        System.out.printf("a++ = %d%n", a++);
        System.out.printf("a-- = %d%n", a--);
        System.out.println("a += 1; -> " +  (a += 1)); // 결과가 끝난 뒤 더해진다.
        System.out.println("a += 1; -> " +  (a += 1));
        System.out.println("a = " +  a);
//        a =+ 1;// 안쓰임
        System.out.println("a++; -> " +  a++); // 결과가 끝난 뒤 더해진다.
        System.out.println("a++; -> " +  a++);
        System.out.println("a = " +  a);
        System.out.println("++a; -> " +  ++a); // 더해진 뒤 결과에 반영한다.
        System.out.println("++a; -> " +  ++a);
        System.out.println("a = " +  a);
    }
    // 사칙연산
    void run1() {
        int a = 10;
        int b = 4;

        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b);
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
    }
}

