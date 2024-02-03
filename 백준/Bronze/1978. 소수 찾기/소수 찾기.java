import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for (int i=0; i<n; i++){
            int m = sc.nextInt();
            if (m==1) continue;
            if (cal(m)) cnt++;

        }
        System.out.println(cnt);
        sc.close();
    }
    public static boolean cal(int n) {
        for (int j = 2; j<n; j++){
            if (n % j == 0) return false;
        }
        
        return true;
    }
}
