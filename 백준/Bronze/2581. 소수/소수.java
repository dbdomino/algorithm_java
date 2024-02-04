import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int min = 0 ;
        int result = 0;
        for (int i =m; i<=n; i++) {
            if (i == 1) {
                continue;
            }
            if (cal(i)){
                if (min == 0 ) min = i;
                result += i;
            }
        }
        if (result == 0) {
            System.out.print(-1);
        } else {
            System.out.println(result);
            System.out.print(min);
        }
        sc.close();
    }

    public static boolean cal(int n) {
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) return false; 
        }
        return true;
    }
}