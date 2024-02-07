import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        // 설탕을 정확하게 N킬로그램을 배달 3키로 5키로  최대한 적은 봉지를 들고 가려고 한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        //  최대한 적은 봉지를 들고 가려고 한다.
        //  만약, 정확하게 N킬로그램을 만들 수 없다면 -1을 출력한다.

        int cnt = 0; //3키로 자루의 수
        // 5로 나누어 떨어진다면 가장 최소의 수
//        if(n % 5 == 0) {
//            System.out.println(n/5 + cnt);
//        }

        // 3키로 하나 나머지 5키로
        // 3키로 두개 나머지 5키로
        // 3키로 3개 나머지 5키로
        // 3키로 4개 나머지 5키로
        // 3키로 5개 면 5키로 3개매는게 나으므로 3키로 0개를 바라보기
        while(true) {
            if(n % 5 == 0) {
                System.out.println(n/5 + cnt);
                break;
            } else if(n < 0 || cnt > 6) {
                System.out.println(-1);
                break;
            }
            n = n-3;
            cnt++;
        }
    }
}