import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        // 첫 번째는 666, 두 번째 1666, 그 다음 3666, ... 여섯 번째 5666, 그 다음 6660, 6661, 6662이 된다는 것을 생각해야 한다.
        // 단순히 N -1 에 666을 붙이는 것은 정답이 아니라는 것이다.
        // contains 메소드를 사용해 666부터 시작하여 "666"을 포함하는 값을 찾을 때까지 반복하고,
        // 666이 포함되어 있다면 cnt 값을 증가시킨다.cnt와 n이 같다면 n번째 영화제목은 number일 것이다.
        int number = 666;
        int cnt = 1;

        while (cnt != n) {
            number++; // 667.. 668.. 669.. ~~ 1666
            if (String.valueOf(number).contains("666")) {
                cnt++;
            }
        }
        System.out.print(number);

    }
}