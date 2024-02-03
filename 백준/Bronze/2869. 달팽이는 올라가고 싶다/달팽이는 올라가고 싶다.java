import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  //올라감
        int b = sc.nextInt();  // 미끄러짐
        int v = sc.nextInt();  // 총 올라가야함..

        int locate = 0;
        int day = 0;
        // 1째날 a만큼감, 2째날 b만큼 떨어지고시작 a만큼가고종료
        day = (v - b) / (a - b);     // 도착하기 전날 기준으로 며칠인지 먼저 구하자. 얼마나 갔는지는 알 수 있다.

        if ( (v-b) % (a-b) != 0 ) { // 0으로 떨어지지 않으면 하루만 더 올라가면 끝나는것이다. 나머지가 있긴하나 1안으로 떨어지는거니까
            // 이때를위해 
            day++;
        }
        System.out.println(day); // 답이 정해져 있으니 v 로, 식을 만들어 날짜를 미리 구하는게 가능하네.
    }
}