import java.util.Scanner;

// 중앙 이동 알고리즘
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = (int) Math.pow(2,n)+1;
        System.out.println(j*j);

        sc.close();
    }
}