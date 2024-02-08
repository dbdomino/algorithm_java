import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//시간 복잡도가 O(nlogn)인 정렬 알고리즘으로 풀 기
// 이 문제는 대부분 Arrays.sort 로 풀면 시간초과가 난다.
// , 최악의 경우에도 O(nlogn) 을 보장하거나 혹은, O(n) 에 가까운 정렬 알고리즘을 사용해야 한다
public class Main {
    public static void main(String[] args) {
// 첫 번째는 Collections.sort() 를 쓰는 방법
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();

        // list 계열 중 하나를 쓰면 된다.
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        for(int value : list) {
            sb.append(value).append('\n');
        }
        System.out.println(sb);

    }
}
