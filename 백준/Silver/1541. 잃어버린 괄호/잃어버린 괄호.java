import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 잃어버린 괄호, 괄호를 적절한 위치에 쳐서, 최소의 결과가 나오도록
public class Main {
    public static void main(String[] args) throws IOException {
        int cnt=0;
        int result=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //한줄로 받음, - + 구분, 괄호쳐서 연산의 우선을 둠,
        // 1. -가 나오면, 다음 - 가 나오기 전까지 괄호쳐서 우선순위로 더해서 음수로 만들어버리면 최소
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        // Iterator.hasnext() 와 비슷
        while (st.hasMoreTokens()) {
            int temp = 0;
            // 플러스로 구분된 값들 합 구하기

            StringTokenizer str = new StringTokenizer(st.nextToken(),"+");
            while(str.hasMoreTokens()) {

                temp += Integer.parseInt(str.nextToken());
            }

            if(cnt == 0)  // 젤첨엔 그냥 더하기
                {result = temp; cnt++;}
            else // 더해진 값들 괄호로 묶어 음수로 처리
                {result -= temp;}
        }
        System.out.print(result);

        br.close();

    }
}
