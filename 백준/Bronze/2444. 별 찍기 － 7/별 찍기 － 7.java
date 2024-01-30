import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        // 0~a-1까지
        for(int i = 0; i<=a-1;i++){

            if(i<a) {
                for (int j = 0; j < a - 1 - i; j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i * 2 + 1; j++) {
                    System.out.print("*");
                }

                //for (int j = 0; j < a - 1 - i; j++) {
                  //  System.out.print(" ");
                //}
            }
            System.out.println();
        }
        // a -2 부터 0 까지
        for(int i = a-2; i>=0 ;i--){
            for (int j = 0; j < a - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            //for (int j = 0; j < a - 1 - i; j++) {
             //   System.out.print(" ");
            //}
            System.out.println();

        }
        sc.close();
    }
}