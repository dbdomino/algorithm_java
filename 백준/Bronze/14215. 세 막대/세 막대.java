import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /* 길이가 a, b, c인 세 막대를 가지고 있고, 각 막대의 길이를 마음대로 줄일 수 있다.
    영선이는 세 막대를 이용해서 아래 조건을 만족하는 삼각형을 만들려고 한다.
각 막대의 길이는 양의 정수이다 (중요)
세 막대를 이용해서 넓이가 양수인 삼각형을 만들 수 있어야 한다.
삼각형의 둘레를 최대로 해야 한다. (1씩감소해서 비교)
    a, b, c가 주어졌을 때, 만들 수 있는 가장 큰 둘레를 구하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 먼저 삼각형을 만들 수 없는 조건을 알아보자.
        //두 변 길이의 합 < 나머지 한 변의 길이
        //2 1 1 / 2 3 5 / 3 5 10
        // 때문에 삼각형을 만들기 위해서는 가장 긴 변의 길이를 줄여나가야 한다.
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int[] arr = {a, b, c};
        Arrays.sort(arr);

        while(true){
            if (arr[0] + arr[1] > arr[2]) break;
            else arr[2]--;

        }
        System.out.println(Arrays.stream(arr).sum());

        sc.close();
    }
}