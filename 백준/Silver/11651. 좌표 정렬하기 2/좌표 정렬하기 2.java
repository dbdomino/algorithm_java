import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] xarr= new int[n];
        int[] yarr= new int[n];
        int[][] arr= new int[n][2];

        StringTokenizer st;
        //  좌표를 y좌표가 증가하는 순으로, y좌표가 같으면 x좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.
        for (int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
//            xarr[i] = Integer.parseInt(st.nextToken());
//            yarr[i] = Integer.parseInt(st.nextToken());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]) { // e1 e2의 첫번째인자가 같다면
                return e1[0] - e2[0]; // e1 e2의 두번째 인자를 가지고 비교
            } else {
                return e1[1] - e2[1]; // e1 e2의 첫번째 인자로 비교, e1가 더크면 양수로로 자리바꿈 -> 오름차순
            }
        });

        for (int i=0; i<n;i++){
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }

    }
}
