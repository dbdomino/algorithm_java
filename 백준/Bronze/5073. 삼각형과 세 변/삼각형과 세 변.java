import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Equilateral :  세 변의 길이가 모두 같은 경우
Isosceles : 두 변의 길이만 같은 경우
Scalene : 세 변의 길이가 모두 다른 경우
단 주어진 세 변의 길이가 삼각형의 조건을 만족하
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[3];

        while(true){
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr);
            if (arr[0]==0 && arr[1]==0 && arr[2]==0) break;

            if (arr[0]+arr[1] <= arr[2]) System.out.println("Invalid");
            else if (arr[0]==arr[1] && arr[1]==arr[2] ) System.out.println("Equilateral");
            else if (arr[0]==arr[1] || arr[1]==arr[2] || arr[2]==arr[0]) System.out.println("Isosceles");
            else System.out.println("Scalene");

            st = new StringTokenizer(br.readLine());
        }


        br.close();

    }
}
