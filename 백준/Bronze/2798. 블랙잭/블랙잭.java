import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i< n; i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        int sum = 0;        //세 수의 합
        int tmp = 0;        //새로운 근사치가 나올때까지 이전 근사치 값

        // 모든 경우의 수를 다 더해서 계산한다.
        for(int i=0; i<n; i++) {            //N만큼 반복(배열 arr을 순회)
            for(int j=i+1; j<n; j++) {        //i+1번째 위치한 arr부터 순회
                for(int k=j+1; k<n; k++) {    //j+1번째부터 arr 순회
                    sum = arr[i] + arr[j] + arr[k];    //세 수를 더한다.
                    //근사치 (tmp) 보다 크고 블랙잭보다 작거나 같으면 새로운 근사치
                    if(tmp < sum && sum <= m)
                        tmp = sum;
                }
            }
        }
        System.out.println(tmp);



        br.close();
    }
}